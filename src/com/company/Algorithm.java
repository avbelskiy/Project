package com.company;

public class Algorithm {
    int number_alg;
    int[] array;
    
    int[] sort_array() {
        switch (number_alg) {
            case (1):   //пузырьком
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

            case (2): //выбором
                for (int min = 0; min < array.length-1; min++) {
                    int least = min;
                    for (int j = min + 1; j < array.length; j++) {
                        if (array[j] < array[least]) {
                            least = j;
                        }
                    }
                    buf = array[min];
                    array[min] = array[least];
                    array[least] = buf;
                }
            case (3):   //вставками
                for (int i = 1; i < array.length; i++) {
                    int current = array[i];
                    int j = i - 1;
                    while(j >= 0 && current < array[j]) {
                        array[j+1] = array[j];
                        j--;
                    }
                    array[j+1] = current;
                }
                break;

            case (4):   //шаттлом (не работает)
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        buf = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buf;
                        for (int z = i - 1; (z - 1) >= 0; z--) {
                            if (array[z] < array[z - 1]) {
                                buf = array[z];
                                array[z] = array[z + 1];
                                array[z + 1] = buf;
                            } else {
                                break;
                            }
                        }
                    }
                }
                break;
            case (5):   //Шелла
                int gap = array.length / 2;
                while (gap >= 1) {
                    for (int right = 0; right < array.length; right++) {
                        for (int c = right - gap; c >= 0; c -= gap) {
                            if (array[c] > array[c + gap]) {
                                buf = array[c];
                                array[c] = array[c + 1];
                                array[c + 1] = buf;
                            }
                        }
                    }
                    gap = gap / 2;
                }
                break;

            default:
                break;
        }
        return array;
    }
}
