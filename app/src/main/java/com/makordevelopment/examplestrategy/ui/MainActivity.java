package com.makordevelopment.examplestrategy.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.makordevelopment.examplestrategy.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    @Bind(R.id.text_login_way) TextView mTextLogin;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new MainPresenterImpl();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.setView(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.clearView();
    }

    @OnClick(R.id.button_facebook)
    public void onFacebookClick() {
        presenter.onFacebookClick();
    }

    @OnClick(R.id.button_google)
    public void onGoogleClick() {
        presenter.onGoogleClick();
    }

    @OnClick(R.id.button_twitter)
    public void onTwitterClick() {
        presenter.onTwitterClick();
    }

    @OnClick(R.id.button_linkedin)
    public void onLinkedInClick() {
        presenter.onLinkedInClick();
    }

    @Override
    public void startLogin(String login) {
        mTextLogin.setText(login);
    }
}
