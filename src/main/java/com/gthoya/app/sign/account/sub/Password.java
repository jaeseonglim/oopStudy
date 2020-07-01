package com.gthoya.app.sign.account.sub;

public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean isValidPassword() {
        return true;
    }

    public boolean isEqualPassword(String password) {
        return this.password.equals(password);
    }
}
