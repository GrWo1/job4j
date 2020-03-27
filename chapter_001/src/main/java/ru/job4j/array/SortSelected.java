package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        for (int i = 0; i < data.length - 1; i++) {
           if (min < data[i] ) {
                    data[index] = data [i];
                    data[i] = min;
                    }
            min = MinDiapason.findMin(data, i + 1, data.length);
            index = FindLoop.indexOf(data, min, i + 1, data.length);
            }
        return data;
    }
}