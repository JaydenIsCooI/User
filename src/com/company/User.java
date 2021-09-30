package com.company;

public class User {

    String firstName;
    String lastName;
    String Username;
    String Password;

    public User(String f, String l, String u, String p) {

        firstName = f;
        lastName = l;
        Username = u;
        Password = p;

    }

    public void getName() {

        System.out.println("Name: " + firstName + " " + lastName);

    }

    public void getString() {

        int i = Password.length();

        System.out.print("First Name: " + firstName + "\nLast Name: " + lastName + "\nPassword: ");

        while (0 < i) {

            System.out.print("*");
            i -= 1;

        }
    }
}