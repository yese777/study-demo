package com.example;


import com.example.dto.UserDTO;
import com.example.entity.User;
import com.example.mapstruct.UserConvert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MapstructApplicationTests {

    @Test
    void contextLoads() {


        List<User> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("zhangsan");
            user.setPassword("123");
            list.add(user);
        }

        List<UserDTO> dtoList = UserConvert.INSTANCE.convert(list);
        System.out.println(dtoList);


    }

}
