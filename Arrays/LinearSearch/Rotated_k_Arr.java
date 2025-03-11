package Arrays.LinearSearch;

import java.util.Arrays;

public class Rotated_k_Arr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
        rotate(arr,-4);
        System.out.println(Arrays.toString(arr));



    }
    static void rotate(int[] arr, int k){
        k= k%arr.length;
        if(k<0){
            k = k+ arr.length;
        }
        for (int i = 1; i <=k ; i++) {
            rotateOne(arr);

        }
    }
    static void rotateOne(int [] arr){
        int temp = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            arr[i-1]= arr[i];

        }
        arr[arr.length-1] =temp;
    }

}
