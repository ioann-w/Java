package hw1;
import java.util.Scanner;

public class task3 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("enter first operand:");
            int x = scan.nextInt();
            System.out.println("enter second operand:");
            int y = scan.nextInt();
            

            System.out.println("enter operation type");
            System.out.println("+ for addition");
            System.out.println("- for subtraction");
            System.out.println("/ for division");
            System.out.println("* for multiplication");
            System.out.println("x for exit");
            char opType = scan.next().charAt(0);

            if (Character.toLowerCase(opType) == 'x') break;

            int result = switch (opType) {
                case '+' -> x + y;
                case '-' -> x - y;
                case '/' -> x / y;
                case '*' -> x * y;
                default -> 0;
            };

            System.out.println("solution:");
            System.out.printf("%d %c %d = %d", x, opType, y, result);
            System.out.println();
            System.out.println("here we go again...");
        }
    }
}
