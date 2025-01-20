package task1; 

public class ArraySolutions2 {

    public static int differenceMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[]{2, 1, 2, 3, 4})); // 3
        System.out.println(differenceMaxMin(new int[]{7, 2, 9, 3})); // 7
    }
}

