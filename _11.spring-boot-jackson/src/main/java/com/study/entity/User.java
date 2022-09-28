package com.study.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 6222176558369919436L;

    private String userName;
    private int age;
    private String password;
    private Date birthday;
}
