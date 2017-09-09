package com.example.validate.domain.vo;

import com.example.validate.validation.annotation.Min;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by silvester on 2017/9/8.
 */
public class User {
    private int userId;
    @NotEmpty
    private String userName;
//    @Range(min = 0L, max = 100L)
    @Min(value = 0,message = "用户年龄必须大于0")
    private int age;
    @NotEmpty
    private String address;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
