package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorytm mas = new Algorytm();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер алгоритма: ");
        mas.number_alg = sc.nextInt();
        if (mas.number_alg != 1) { System.out.println("Алгоритм с таким номером не существует.");}
        else {
            System.out.println("Введите длину массива: ");
            int n = sc.nextInt();
            mas.array = new int[n];
            System.out.println("Введите сам массив (числа через пробел): ");
            for (int i = 0; i < n; i++) {
                mas.array[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(mas.sort_array()));
        }
    }
}
