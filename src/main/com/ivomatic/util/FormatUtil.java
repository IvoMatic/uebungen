package com.ivomatic.util;

import com.ivomatic.model.Kunde;

public class FormatUtil {

    public static String createFullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }

    public static String createAddress(String street, String houseNumber, String zipCode, String city) {
        return street + " " + houseNumber + ", " + zipCode + " " + city;
    }
}
