package hw1;
import java.util.Scanner;

public class task1 {
    private static Scanner scan = new Scanner(System.in);

    public static void getCube(int[] ca){
        System.out.println("enter number:");
        System.out.printf("cube of this number is %d", ca[scan.nextInt()-1]);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("generating array of cubes...");
        int[] cubeArr = new int[1000];
        for (int i = 0; i < cubeArr.length; i++) {
            cubeArr[i] = (i+1) * (i+1) * (i+1);
        }
        System.out.println("array ready");

        getCube(cubeArr);
        getCube(cubeArr);
    }
}