package com.example.service;

import com.example.dto.ResponseDTO;
import com.github.lianjiatech.retrofit.spring.boot.annotation.RetrofitClient;
import org.springframework.stereotype.Service;
import retrofit2.http.GET;

@Service
@RetrofitClient(baseUrl = "http://whois.pconline.com.cn")
public interface HttpApi {
    @GET("/ipJson.jsp?ip=192.168.31.147&json=true")
    ResponseDTO testSend();
}
