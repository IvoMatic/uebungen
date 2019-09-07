package com.ivomatic.util;

import com.ivomatic.model.Kunde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormatUtil {

    public static String createFullName(String firstName, String middleName, String lastName) {
        List<String> fullNameString = new ArrayList<>(Arrays.asList(firstName, middleName, lastName));
        System.out.println(fullNameString);
        StringBuilder fullName = new StringBuilder();
        for (String e : fullNameString) {
            if(e != null && !e.equals("")) {
                fullName.append(e).append(" ");
            }
        }

        return fullName.toString();

    }

    public static String createAddress(String street, String houseNumber, String zipCode, String city) {
        return street + " " + houseNumber + ", " + zipCode + " " + city;
    }
}
