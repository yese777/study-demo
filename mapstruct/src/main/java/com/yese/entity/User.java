package com.yese.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    // dto 中为 name
    private String username;
    private String password;

}