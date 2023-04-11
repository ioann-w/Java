package hw5;

import java.util.Scanner;
import java.util.Random;

public class task3 {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2*i + 1; 
        int r = 2*i + 2; 

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            Random rand = new Random();

            System.out.println("Исходный массив:");

            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(1000);
                System.out.print(arr[i] + " ");
            }

            heapSort(arr);

            System.out.println("\nОтсортированный массив:");

            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
        }
    }
}