package com.lylechristine.tostring;

public class PersonToString {

    String name;
    int age;
    String phoneNumber;

    public PersonToString(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.phoneNumber;
    }
}
