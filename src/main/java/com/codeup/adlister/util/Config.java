package com.codeup.adlister.util;

public class Config {
    public static final String url = "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    public static final String username = "root";
    public static final String password = "codeup";

    public String getUrl() {
        return url;
    }
    public String getUser() {
        return username;
    }
    public String getPassword() {
        return password;
    }


}