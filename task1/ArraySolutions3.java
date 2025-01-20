package task1;

public class ArraySolutions3 {

    public static boolean hasAdjacentZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasAdjacentZeros(new int[]{2, 1, 0, 0, 4})); // true
        System.out.println(hasAdjacentZeros(new int[]{0, 2, 0})); // false
    }
}

