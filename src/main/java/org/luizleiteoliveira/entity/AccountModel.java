package org.luizleiteoliveira.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AccountModel implements Serializable {

    private String country;
    private List<AccountField> accountFields  = new ArrayList<>();

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
