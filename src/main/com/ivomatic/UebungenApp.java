package com.ivomatic;

import com.ivomatic.model.Person;

public class UebungenApp {

    public static void main(String[] args) {
        Person person = new Person(
                "Ivo",
                "Matic",
                "Anneliese-Hoevel-Str",
                "9",
                "60435",
                "Frankfurt");

        System.out.println(person.getFullName());
    }
}
