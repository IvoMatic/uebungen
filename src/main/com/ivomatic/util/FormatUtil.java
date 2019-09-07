package com.ivomatic.util;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FormatUtil {

    private static String concatStrings(String delimiter, String... strings) {
        return Stream.of(strings)
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.joining(delimiter));
    }

    public static String createAddress(String street, String houseNumber, String zipCode, String city) {
        return concatStrings(
                ", ",
                concatStrings(" ", street, houseNumber),
                concatStrings(" ", zipCode, city));
    }

    public static String createFullName(String... names) {
        return concatStrings(" ", names);
    }
}
