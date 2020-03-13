package org.luizleiteoliveira.entity;

import java.util.Collections;
import java.util.List;

public class AccountModel {

    private String country;
    private List<AccountField> accountFields = Collections.EMPTY_LIST;

    public AccountModel(String country) {
        this.country = country;
    }

    public AccountModel(String country, List<AccountField> accountFieldList) {
        this.country = country;
        this.accountFields = accountFieldList;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<AccountField> getAccountFields() {
        return accountFields;
    }

    public void setAccountFields(List<AccountField> accountFields) {
        this.accountFields = accountFields;
    }
}
