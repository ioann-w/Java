package hw2;

public class task1 {

    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        int[] jewelCount = new int[jewels.length()];
        
        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (stone == jewel) jewelCount[jewels.indexOf(jewel)] += 1;
            }
        }
        
        System.out.println("jewels amount:");
        for (char jewel : jewels.toCharArray()) {
            System.out.printf("%c - %d\n", jewel, jewelCount[jewels.indexOf(jewel)]);
        }
    }
}