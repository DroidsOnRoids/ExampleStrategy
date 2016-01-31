package com.makordevelopment.examplestrategy.ui;

public interface MainView {

    void startLogin(String login);

    class EmptyMainView implements MainView {

        @Override
        public void startLogin(String login) {

        }
    }
}
