import java.util.Random;

public class task1 {
    static int[] mergeSort(int[] m) {
        int[] left;
        int[] right;
        int[] result;
        if (m.length <= 1) return m;

        int middle = m.length / 2;

        left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = m[i];
        }

        right = new int[middle];
        for (int i = middle; i < m.length; i++) {
            right[i-middle] = m[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);
        result = new int[m.length];

        int i = 0;
        int j = 0;
        for (int k = 0; k < result.length; k++) {
            if (j >= right.length || (i < left.length && left[i] > right[j])) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
        }
        return result;
    }

    static int[] selectSort(int[] m) {
        for (int i = 0; i < m.length; i++) {
            int maxIdx = i;
            for (int j = i; j < m.length; j++) {
                if (m[j] > m[maxIdx]) maxIdx = j;
            }
            int x = m[i];
            m[i] = m[maxIdx];
            m[maxIdx] = x;
        }
        return m;
    }

    static void printArray(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.printf("%d ", m[i]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arr = new int[8];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 100);
        }

        System.out.println("origin array:");
        printArray(arr);
        
        int[] mergeSorted = mergeSort(arr);

        System.out.println("merge sorted:");
        printArray(mergeSorted);

        int[] selectSorted = selectSort(arr);

        System.out.println("select sorted:");
        printArray(selectSorted);
    }
}