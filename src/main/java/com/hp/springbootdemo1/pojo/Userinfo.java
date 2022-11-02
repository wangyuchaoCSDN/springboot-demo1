package com.hp.springbootdemo1.pojo;

import lombok.Data;

@Data
public class Userinfo {
    private Integer uid;
    private String username;
    private String password;
    private String sex;
    private String phone;
    private String email;
}
