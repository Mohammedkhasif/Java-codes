package Arrays.LinearSearch;

public class BasicLinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,11,12,23,34,45,56,67};
        int target = 34;
        int ans = linearsearch(arr,target);
        System.out.println(ans);


    }
    static int linearsearch(int[]arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index <arr.length ; index++) {
            int element = arr[index];

            if(element== target){
                return index;
            }


        }
        System.out.println("not found");
        //if not found
        return -1;
    }
}

