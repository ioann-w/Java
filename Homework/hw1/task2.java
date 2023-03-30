package hw1;
import java.util.Scanner;

public class task2 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter numbers count:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("enter number #%d:", i+1);
            System.out.println();
            arr[i] = scan.nextInt();
        }
        System.out.println("enter multiplier:");
        int mult = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d * %d = %d", arr[i], mult, arr[i] * mult);
            System.out.println();
        }
    }
}