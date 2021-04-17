package com.yese.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义用户名验证规则
 * 用户名需要以abc开头
 */
public class UsernameValidator implements ConstraintValidator<Username, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 不为null才进行校验
        if (value != null) {
            return value.startsWith("abc");
        }
        return true;
    }

}
