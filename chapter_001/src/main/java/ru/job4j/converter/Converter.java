package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70; // формула перевода евро в рубли
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60; // формула перевода доллара в рубли
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " euro.");

        int rubleE = Converter.euroToRuble(2);
        System.out.println("2 euro = " + rubleE + " rubles");

        int rubleD = Converter.dollarToRuble(3);
        System.out.println("3 dollars = " + rubleD + " rubles");


    }
}
