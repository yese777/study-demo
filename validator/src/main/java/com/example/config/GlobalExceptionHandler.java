package com.example.config;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * post方式提交json数据,参数校验失败后,会抛出一个MethodArgumentNotValidException
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {

        // 将所有的错误提示使用";"拼接起来并返回
        StringJoiner sj = new StringJoiner(";");
        e.getBindingResult().getFieldErrors().forEach(x -> sj.add(x.getDefaultMessage()));

        // 此处通常定义一个全局相应对象返回
        Map<String, Object> map = new HashMap<>();
        // 此处状态码可以通过枚举或者常量定义
        map.put("code", 1001);
        map.put("msg", sj.toString());
        return map;
    }

    /**
     * get方式提交参数,参数校验失败后,会抛出一个ConstraintViolationException
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public Map<String, Object> handleConstraintViolationException(ConstraintViolationException e) {
        StringJoiner sj = new StringJoiner(";");
        e.getConstraintViolations().forEach(x -> sj.add(x.getMessage()));

        Map<String, Object> map = new HashMap<>();
        map.put("code", 1001);
        map.put("msg", sj.toString());
        return map;
    }

}