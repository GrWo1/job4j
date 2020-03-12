package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        boolean condition = result >= second;
        result = condition ? first : second;
        condition = result >= third;
        result = condition ? result : third;
        return result;
    }
}