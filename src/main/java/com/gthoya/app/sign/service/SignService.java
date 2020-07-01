package com.gthoya.app.sign.service;

import com.gthoya.app.sign.account.Account;
import com.gthoya.app.sign.account.AccountInfo;
import com.gthoya.app.sign.account.sub.*;
import com.gthoya.app.sign.terms.Terms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SignService {
    private final List<Terms> termsList;

    public SignService() {
        this.termsList = new ArrayList<>();
    }

    public void clickUseTerms(Terms useTerms) {
        termsList.add(useTerms);
    }

    public void clickPrivacyTerms(Terms privacyTerms) {
        termsList.add(privacyTerms);
    }

    public void clickLocationTerms(Terms locationTerms) {
        termsList.add(locationTerms);
    }

    public void clickEventTerms(Terms eventTerms) {
        termsList.add(eventTerms);
    }

    public boolean isValidTerms() {
        for (Terms terms : termsList) {
            if (!terms.isRequiredCheck()) {
                return false;
            }
        }

        return true;
    }

    public boolean signUp(String id, String password1, String password2, String name,
                          String birthday, Gender gender, String email, String phone) {
        Password password = new Password(password1);
        if (!password.isEqualPassword(password2)) {
            return false;
        }

        Account account = new Account(new ID(id), password);
        if (!account.isValidAccount()) {
            return false;
        }

        AccountInfo accountInfo = new AccountInfo(account, name, LocalDate.parse(birthday),
                gender, new Email(email), new Phone(phone));
        if (!accountInfo.isValidAccountInfo()) {
            return false;
        }

        accountInfo.setTermsList(termsList);

        return true;
    }
}
