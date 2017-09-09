package com.example.validate.domain.vo;

/**
 * Created by silvester on 2017/9/8.
 */
public class Person {
    private int personId;
    private String name;
    private String password;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
