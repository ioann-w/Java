package hw2;

public class task3 {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;

        String[] receipts   = new String[n];
        String[] components = new String[m];

        receipts[0] = "Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.";
        receipts[1] = "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.";

        components[0] = "арахис - колбаса";
        components[1] = "клубника - вишня";
        components[2] = "сгущенка - молоко";

        String target = "";
        String replmt = "";

        for (String component : components) {
            target = component.substring(0, component.indexOf(" -"));
            replmt = component.substring(component.indexOf("- ")+2);

            for (String receipt : receipts) {
                String newReceipt = receipt;
                String[] words = receipt.split("\\s");
                for (String word : words) {
                    StringBuilder replmnt2 = new StringBuilder(replmt);
                    if (word.compareToIgnoreCase(target) == 0) {
                        if (Character.isUpperCase(word.charAt(0))) replmnt2.setCharAt(0, Character.toUpperCase(replmnt2.charAt(0)));
                        newReceipt = newReceipt.replace(word, replmnt2);
                    }
                }
                receipts[java.util.Arrays.asList(receipts).indexOf(receipt)] = newReceipt;
            }
        }

        for (String receipt : receipts) {
            System.out.println(receipt);
        }
    }
}