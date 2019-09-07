package com.ivomatic;

import com.ivomatic.model.Bevollmaechtigter;
import com.ivomatic.model.Kunde;

public class UebungenApp {

    public static void main(String[] args) {
        Kunde kunde = new Kunde(
                "Ivo",
                "Matic",
                "Anneliese-Hoevel-Str.",
                "9",
                "60435",
                "Frankfurt");

        System.out.println(kunde.getFullName());
        System.out.println(kunde.getAddress());

        //////////////////////////////////////////////////////////////////////////////////

        Bevollmaechtigter bevollmaechtigter = new Bevollmaechtigter(
                "Marija",
                "Ivancic",
                "Biokovska ul.",
                "52",
                "10010",
                "Zagreb");

        System.out.println(bevollmaechtigter.getFullName());
        System.out.println(bevollmaechtigter.getAddress());

















    }
}
