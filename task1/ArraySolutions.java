package task1; 

public class ArraySolutions {

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4})); // 3
        System.out.println(countEvens(new int[]{2, 2, 0})); // 3
        System.out.println(countEvens(new int[]{1, 3, 5})); // 0
    }
}
