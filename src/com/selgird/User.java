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

    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
