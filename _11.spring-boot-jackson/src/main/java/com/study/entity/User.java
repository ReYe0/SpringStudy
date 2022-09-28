package com.study.entity;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@JsonIgnoreProperties({ "password", "age" })
//@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class User implements Serializable {
    private static final long serialVersionUID = 6222176558369919436L;
    public interface UserNameView {
    };

    public interface AllUserFieldView extends UserNameView {
    };
    @JsonView(UserNameView.class)
    private String userName;
    @JsonView(AllUserFieldView.class)
    private int age;
    @JsonIgnore
    @JsonView(AllUserFieldView.class)
    private String password;
    @JsonProperty("bth")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonView(AllUserFieldView.class)
    private Date birthday;
}
