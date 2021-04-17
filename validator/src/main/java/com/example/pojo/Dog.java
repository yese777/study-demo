package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    /**
     * 狗的名字
     */
    @NotBlank(message = "{dogName.NotBlank}")
    private String name;

}