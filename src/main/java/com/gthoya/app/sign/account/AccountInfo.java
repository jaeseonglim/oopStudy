package com.gthoya.app.sign.account;

import com.gthoya.app.sign.account.sub.Email;
import com.gthoya.app.sign.account.sub.Gender;
import com.gthoya.app.sign.account.sub.Phone;
import com.gthoya.app.sign.terms.Terms;

import java.time.LocalDate;
import java.util.List;

public class AccountInfo {
    private Account account;
    private String name;
    private LocalDate birthday;
    private Gender gender;
    private Email email;
    private Phone phone;

    private List<Terms> termsList;

    public AccountInfo(Account account, String name, LocalDate birthday, Gender gender,
                       Phone phone) {
        this(account, name, birthday, gender, null, phone);
    }

    public AccountInfo(Account account, String name, LocalDate birthday, Gender gender,
                       Email email, Phone phone) {
        this.account = account;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public boolean isValidAccountInfo() {
        if (!phone.isValidPhone()) {
            return false;
        }

        if (email != null && !email.isValidEmail()) {
            return false;
        }

        return true;
    }

    public void setTermsList(List<Terms> termsList) {
        this.termsList = termsList;
    }
}
