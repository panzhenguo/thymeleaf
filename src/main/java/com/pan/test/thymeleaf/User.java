package com.pan.test.thymeleaf;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer Id;
    private String name;
    private String nikeName;
    private Date createTime;
}
