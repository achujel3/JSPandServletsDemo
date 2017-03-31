package com.servletdemo.registration.form;

import com.servletdemo.login.form.User;

public class RegistrationService {

    public boolean authenticate(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        if ((username.length() > 0) && (password.length() > 0)
                && (username != null) && (password != null)) {
            return true;
        }
        return false;
    }

}
