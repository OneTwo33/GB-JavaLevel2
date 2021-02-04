package ru.company.onetwo33.homework3;

import java.util.*;

public class Phonebook {

    private Set<Contact> contacts = new HashSet<>();

    public void add(String lastName, String phone) {
        if (!checkPhones(lastName).isEmpty())
            checkPhones(lastName).add(phone);
        else
            contacts.add(new Contact(lastName, phone));
    }

    public List<String> checkPhones(String lastName) {
        for (Contact c : contacts) {
            if (c.getLastName().equals(lastName))
                return c.getPhones();
        }
        return new ArrayList<>();
    }

    public void get(String lastName) {
        for (Contact c : contacts) {
            if (c.getLastName().equals(lastName))
                System.out.println(c.getPhones());
        }
    }
}
