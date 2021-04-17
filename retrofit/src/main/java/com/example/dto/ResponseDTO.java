package com.example.dto;

import lombok.Data;

@Data
public class ResponseDTO {
    private String ip;
    private String pro;
    private String proCode;
    private String city;
    private String cityCode;
    private String region;
    private String regionCode;
    private String addr;
    private String regionNames;
    private String err;
}