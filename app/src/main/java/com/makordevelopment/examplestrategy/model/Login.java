package com.makordevelopment.examplestrategy.model;

public class Login {

    protected LoginInterface mLoginInterface;

    public String doLogin() {
        return mLoginInterface.login();
    }
}
