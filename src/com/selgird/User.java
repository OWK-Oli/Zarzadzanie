package com.selgird;

public class User {
    protected String id;
    protected String login;
    protected String password;
    protected User(String id, String login, String password){
        this.password = password;
        this.login = login;
        this.id = id;
    }
}
