package com.makordevelopment.examplestrategy;

import com.makordevelopment.examplestrategy.model.Login;
import com.makordevelopment.examplestrategy.model.facebook.FacebookLogin;
import com.makordevelopment.examplestrategy.model.google.GoogleLogin;
import com.makordevelopment.examplestrategy.model.linkedin.LinkedInLogin;
import com.makordevelopment.examplestrategy.model.twitter.TwitterLogin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void testLogin_facebook() {
        Login login = new FacebookLogin();
        assertEquals("Login with Facebook", login.doLogin());
    }

    @Test
    public void testLogin_google() {
        Login login = new GoogleLogin();
        assertEquals("Login with Google", login.doLogin());
    }

    @Test
    public void testLogin_twitter() {
        Login login = new TwitterLogin();
        assertEquals("Login with Twitter", login.doLogin());
    }

    @Test
    public void testLogin_linkedin() {
        Login login = new LinkedInLogin();
        assertEquals("Login with LinkedIn", login.doLogin());
    }
}
