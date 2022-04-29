package com.company;

import java.util.Arrays;

public class Algorithm {

    int number_alg;
    int[] array;

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static int[] bucketSort(int[] arr) {
        int gg, j;
        int[] bucket = new int[arr.length+1];
        Arrays.fill(bucket, 0);

        for (gg = 0; gg < arr.length; gg++) {
            bucket[arr[gg]]++;
        }

        int k=0;
        for (gg = 0; gg < bucket.length; gg++) {
            for (j = 0; j<bucket[gg]; j++) {
                arr[k++] = gg;
            }
        }
        return arr;
    }

    public static void sort( int[] input,int n)
    {
        int min=0,max=0;
        for (int i = 1; i < n; i++)
        {
            if (input[i] > max)
                max = input[i];
            if (input[i] < min)
                min = input[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < n; i++)
            count[input[i] - min]++;
        for (int i = 1; i < range; i++)

            count[i] += count[i - 1];
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                input[j++] = i + min;
    }

    int[] sort_array() {
        switch (number_alg) {
            case (1):   //метод пузырька
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

            case (2): //метод выбора
                for (int min = 0; min < array.length - 1; min++) {
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
            case (3):   //метод вставками
                for (int i = 1; i < array.length; i++) {
                    int current = array[i];
                    int j = i - 1;
                    while (j >= 0 && current < array[j]) {
                        array[j + 1] = array[j];
                        j--;
                    }
                    array[j + 1] = current;
                }
                break;

            case (4):   //метод шаттла
                int left = 0;
                int right = array.length - 1;
                do {
                    for (int i = left; i < right; i++) {
                        if (array[i] > array[i + 1]) {
                            array[i] ^= array[i + 1];
                            array[i + 1] ^= array[i];
                            array[i] ^= array[i + 1];
                        }
                    }
                    right--;
                    for (int i = right; i > left; i--) {
                        if (array[i] < array[i - 1]) {
                            array[i] ^= array[i - 1];
                            array[i - 1] ^= array[i];
                            array[i] ^= array[i - 1];
                        }
                    }
                    left++;
                } while (left <= right);
                break;

            case (5):   //метод Шелла
                int gap = array.length / 2;
                while (gap >= 1) {
                    for (int rightt = 0; rightt < array.length; rightt++) {
                        for (int c = rightt - gap; c >= 0; c -= gap) {
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

            case (6):   //метод быстрой сортировки
                quickSort(array, 0, array.length - 1);
                break;

            case (7):   //метод перемешивания
                boolean isSwapped = true;
                int start = 0;
                int end = array.length;

                while (isSwapped) {
                    isSwapped = false;
                    for (int i = start; i < end - 1; ++i) {
                        if (array[i] > array[i + 1]) {
                            int temp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = temp;
                            isSwapped = true;
                        }
                    }
                    if (isSwapped)
                        break;
                    isSwapped = false;
                    end = end - 1;

                    for (int i = end - 1; i >= start; i--) {
                        if (array[i] > array[i + 1]) {
                            int temp = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = temp;
                            isSwapped = true;
                        }
                    }
                    start = start + 1;
                }
                break;

            case (8):   //метод подсчета (не работает)
                sort(array, array.length);
                break;

            default:
                break;
        }
        return array;
    }
}
