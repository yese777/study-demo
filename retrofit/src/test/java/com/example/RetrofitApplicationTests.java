package com.example;

import com.example.dto.ResponseDTO;
import com.example.service.HttpApi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RetrofitApplicationTests {
    @Autowired
    private HttpApi httpApi;

    @Test
    void contextLoads() {
        ResponseDTO dto = httpApi.testSend();
        System.out.println(dto);
    }

}
