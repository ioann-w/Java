package hw4;

import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class task3 {

    public static boolean validate(Deque<String> deque) {
        Deque<String> storage = new ArrayDeque<>();
        while (deque.size() > 0) {
          String firstDeque = deque.pollFirst();
          String lastStorage = storage.peekLast();
          if ((firstDeque == "(" || firstDeque == "[" || firstDeque == "{")) {
            storage.addLast(firstDeque);
          } else if ((firstDeque == ")" && lastStorage == "(") || (firstDeque == "}" && lastStorage == "{")
              || (firstDeque == "]" && lastStorage == "[")) {
            storage.removeLast();
          } else {
            storage.addLast(firstDeque);
          }
        }
        if (storage.size() > 0) {
          return false;
        }
        return true;
      }
    
      public static void main(String[] args) {
        Deque<String> d1 = new ArrayDeque<>(Arrays.asList("(", "{", "[", "]", "}", ")", "(", ")"));
        if (validate(d1)) {
          System.out.println("right");
        } else {
          System.out.println("wrong");
        }
      }

}