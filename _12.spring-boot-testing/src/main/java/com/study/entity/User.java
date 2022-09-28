package com.study.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "T_USER")
@Data
public class User {
    @Id
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String passwd;

    @Column(name = "CRATE_TIME")
    private Date createTime;

    @Column(name = "STATUS")
    private String status;
}
