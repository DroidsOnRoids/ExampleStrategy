package com.makordevelopment.examplestrategy.ui;

public interface MainPresenter {

    void setView(MainView view);
    void clearView();

    void onFacebookClick();
    void onGoogleClick();
    void onTwitterClick();
    void onLinkedInClick();
}
