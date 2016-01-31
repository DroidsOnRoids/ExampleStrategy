package com.makordevelopment.examplestrategy.ui;

import com.makordevelopment.examplestrategy.model.Login;
import com.makordevelopment.examplestrategy.model.facebook.FacebookLogin;
import com.makordevelopment.examplestrategy.model.google.GoogleLogin;
import com.makordevelopment.examplestrategy.model.linkedin.LinkedInLogin;
import com.makordevelopment.examplestrategy.model.twitter.TwitterLogin;

public class MainPresenterImpl implements MainPresenter {

    private MainView mMainView = new MainView.EmptyMainView();
    private Login login;

    @Override
    public void setView(MainView view) {
        mMainView = view;
    }

    @Override
    public void clearView() {
        mMainView = new MainView.EmptyMainView();
    }

    @Override
    public void onFacebookClick() {
        login = new FacebookLogin();
        startLogin();
    }

    @Override
    public void onGoogleClick() {
        login = new GoogleLogin();
        startLogin();
    }

    @Override
    public void onTwitterClick() {
        login = new TwitterLogin();
        startLogin();
    }

    @Override
    public void onLinkedInClick() {
        login = new LinkedInLogin();
        startLogin();
    }

    private void startLogin() {
        mMainView.startLogin(login.doLogin());
    }
}
