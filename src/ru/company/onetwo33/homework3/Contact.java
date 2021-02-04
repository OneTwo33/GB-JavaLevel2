package ru.company.onetwo33.homework3;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String lastName;
    private List<String> phones = new ArrayList<>();

    public Contact(String lastName, String phone) {
        this.lastName = lastName;
        this.phones.add(phone);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhone(List<String> phones) {
        this.phones = phones;
    }


}
