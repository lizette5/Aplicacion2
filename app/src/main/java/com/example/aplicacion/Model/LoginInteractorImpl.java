package com.example.aplicacion.Model;
import android.os.Handler;
import android.text.TextUtils;

import org.w3c.dom.Text;

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String username, String password, OnLoginFinishedListener listener) {

          new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    return;
                }
                listener.onSuccess();
            }
        }, 1000);
    }
}

