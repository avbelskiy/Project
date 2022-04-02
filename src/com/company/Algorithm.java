package com.company;

public class Algorithm {
    int number_alg;
    int[] array;
    
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
                for (int min = 0; min < array.length-1; min++) {
                    int least = min;
                    for (int j = min + 1; j < array.length; j++) {
                        if (array[j] < array[least]) {
                            least = j;
                        }
                    }
                    int tmp = array[min];
                    array[min] = array[least];
                    array[least] = tmp;
                }

            default:
                break;
        }
        return array;
    }
}
