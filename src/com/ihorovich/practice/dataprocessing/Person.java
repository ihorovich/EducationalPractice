package com.ihorovich.practice.dataprocessing;

public class User {
    private String name;
    private int password;
    private int repeatPassword;

    public User(String name, int password, int repeatPassword) {
        this.name = name;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getName() {
        return name;
    }
    public int getPassword() {
        return password;
    }
    public int getRepeatPassword() {
        return repeatPassword;
    }




}
