package com.makordevelopment.examplestrategy.model.facebook;

import com.makordevelopment.examplestrategy.model.LoginInterface;

public class LoginWithFacebook implements LoginInterface {

    @Override
    public String login() {
        return "Login with Facebook";
    }
}
