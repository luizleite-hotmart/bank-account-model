package org.luizleiteoliveira.entity;

import java.io.Serializable;

public class AccountField implements Serializable {

    private String name;
    private String regex;
    private String type;
    private String description;


    public AccountField(String name, String regex, String type, String description) {
        this.name = name;
        this.regex = regex;
        this.type = type;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
