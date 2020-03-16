package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double result = amount;
        while (result > 0) {
                year +=1;
                result = (result - salary) + amount * (percent / 100);
        }
        return year;
    }
}