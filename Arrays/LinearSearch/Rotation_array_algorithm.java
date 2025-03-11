package Arrays.LinearSearch;

import java.util.Arrays;

public class Rotation_array_algorithm {
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5};
            System.out.println(Arrays.toString(arr));
            rotate(arr,3);
            System.out.println(Arrays.toString(arr));
            rotate(arr,-4);
            System.out.println(Arrays.toString(arr));
            rotate(arr,3);
            System.out.println(Arrays.toString(arr));
            rotate(arr,7);
            System.out.println(Arrays.toString(arr));



        }
        static void reverse(int[] arr, int start , int end){
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }

        static void rotate(int[] arr, int k){
            k= k%arr.length;
            if(k<0){
                k = k+ arr.length;
            }
            reverse(arr, 0 , k-1);
            reverse(arr, k, arr.length-1);
            reverse(arr, 0,arr.length-1);

        }
}
