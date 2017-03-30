package com.servletdemo.login.form;

public class LoginService {

    public boolean authenticate(String username, String password) {
        if ((username.length() > 0) && (password.length() > 0)
                && (username != null) && (password != null)) {
            return true;
        }
        return false;
    }

}
