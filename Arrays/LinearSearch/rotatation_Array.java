package Arrays.LinearSearch;

import java.util.Arrays;

public class rotatation_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void rotate(int [] arr){
        int temp = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            arr[i-1]= arr[i];

        }
        arr[arr.length-1] =temp;
    }
}
