package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorytm mas = new Algorytm();
        mas.array = new int[] {3, 1, 4, 7, 3, 9, 2, 6, 4};
        System.out.println(Arrays.toString(mas.sort_array()));
    }
}
