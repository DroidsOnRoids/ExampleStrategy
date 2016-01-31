package com.makordevelopment.examplestrategy.model.twitter;

import com.makordevelopment.examplestrategy.model.Login;

public class TwitterLogin extends Login {

    public TwitterLogin() {
        mLoginInterface = new LoginWithTwitter();
    }
}
