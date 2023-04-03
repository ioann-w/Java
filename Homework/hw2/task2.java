package hw2;

public class task2 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {3, 2, 1};
        StringBuilder z = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            z.setCharAt(i, s.charAt(index[i]-1));
        }

        System.out.println(z);
    }
}