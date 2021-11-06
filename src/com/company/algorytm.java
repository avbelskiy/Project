package com.company;

public class Algorytm {
    int number_alg;
    int[] array;
    //String error = "";

    int[] sort_array() {
        switch (number_alg) {
            case (1):
                boolean isSorted = false;
                int buf;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < array.length - 1; i++) {
                        if (array[i] > array[i + 1]) {
                            isSorted = false;
                            buf = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = buf;
                        }
                    }
                }
                break;

            case (2):
                for (int left = 0; left < array.length; left++) {
                    int minInd = left;
                    for (int i = left; i < array.length; i++) {
                        if (array[i] < array[minInd]) {
                            minInd = i;
                        }
                    }
                    //swap(array, left, minInd);
                }

            default:
                //error = "Алгоритм с таким номером не существует.";
                //System.out.println(error);
                break;
        }
        return array;
    }
}
