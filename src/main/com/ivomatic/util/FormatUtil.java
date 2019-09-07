package com.ivomatic.util;

import com.ivomatic.model.Kunde;

public class FormatUtil {

    public static String createFullName(String firstName, String middleName, String lastName) {
        if(firstName == null)
           return middleName + " " + lastName;
        else if(middleName == null)
            return  firstName + " " + lastName;
        else if(lastName == null)
            return firstName + " " + middleName;
        else
        return firstName + " " + middleName + " " + lastName;
    }

    public static String createAddress(String street, String houseNumber, String zipCode, String city) {
        return street + " " + houseNumber + ", " + zipCode + " " + city;
    }
}
