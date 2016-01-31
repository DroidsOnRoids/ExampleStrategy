package com.makordevelopment.examplestrategy.model.linkedin;

import com.makordevelopment.examplestrategy.model.Login;

public class LinkedInLogin extends Login {

    public LinkedInLogin() {
        mLoginInterface = new LoginWithLinkedIn();
    }
}
