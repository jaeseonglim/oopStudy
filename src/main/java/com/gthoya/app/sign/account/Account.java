package com.gthoya.app.sign.account;

import com.gthoya.app.sign.account.sub.ID;
import com.gthoya.app.sign.account.sub.Password;

public class Account {
    private ID id;
    private Password password;

    public Account(ID id, Password password) {
        this.id = id;
        this.password = password;
    }

    public boolean isValidAccount() {
        if (!id.isValidId()) {
            return false;
        }

        if (!password.isValidPassword()) {
            return false;
        }

        return true;
    }
}
