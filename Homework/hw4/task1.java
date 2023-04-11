package hw4;

import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class task1 {

    public static boolean checkOn(Deque<Integer> deque) {
        Boolean flag = true;
        int len = deque.size() / 2;
        for (int i = 0; i < len; i++) {
          if (deque.pollFirst() != deque.pollLast())
            flag = false;
    
        }
        if (flag)
          System.out.println("yes");
        else
          System.out.println("no");
        return false;
      }
    
      public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 1, 4, 3, 2, 1));
        checkOn(deque);
      }

}