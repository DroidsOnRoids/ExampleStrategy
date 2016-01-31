package com.makordevelopment.examplestrategy.model.google;

import com.makordevelopment.examplestrategy.model.Login;

public class GoogleLogin extends Login {

    public GoogleLogin() {
        mLoginInterface = new LoginWithGoogle();
    }
}
