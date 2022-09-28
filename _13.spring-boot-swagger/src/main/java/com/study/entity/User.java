package com.study.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -2731598327208972274L;

    private Long id;
    private String name;
    private Integer age;
}
