package com.makordevelopment.examplestrategy.model.facebook;

import com.makordevelopment.examplestrategy.model.Login;

public class FacebookLogin extends Login {

    public FacebookLogin() {
        mLoginInterface = new LoginWithFacebook();
    }
}
