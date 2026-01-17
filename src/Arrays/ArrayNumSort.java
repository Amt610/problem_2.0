package Arrays;

import java.util.Arrays;

public class ArrayNumSort {
    public static void main(String[] args) {
        int[] arr={2,5,3,6,8,8,6};

        System.out.println("Original Array List: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array List: "+Arrays.toString(arr));
    }
}
