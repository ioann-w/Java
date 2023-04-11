package hw4;

import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class task2 {

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> dResult = new ArrayDeque<>();
        int cash = 0;
        int len = Math.max(d1.size(), d2.size());
        for (int i = 0; i < len; i++) {
          int sum = d1.pollFirst() + d2.pollFirst() + cash;
          dResult.addLast(sum % 10);
          cash = sum / 10;
        }
        if (cash > 0)
          dResult.addLast(cash);
        return dResult;
      }
    
      public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        System.out.println(sum(d1, d2));
      }

}