package com.lylechristine.tostring;

public class ToStringMain {

    public static void main(String[] args) {

        PersonTest p1 = new PersonTest("Sammy Davis", 56, "0787756563467");
        PersonTest p2 = new PersonTest("Sarah Hill", 34, "054757345434");
        PersonTest p3 = new PersonTest("Alfie McTaggart", 20, "465454654");

        p1.toString();

        System.out.println(p2.toString());
    }
}
