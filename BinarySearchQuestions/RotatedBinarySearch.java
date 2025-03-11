package BinarySearchQuestions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }
    static int search(int[] nums, int target){
        int pivot = findpivot(nums);
        //if u did not find the pivot then the array is not rotated, just do normal binary search
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(nums,target, 0, nums.length-1);
        }
        // if pivot is found,   U HAVE FOUND 2 SORTED ARRAYS
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums,target, pivot+1, nums.length-1);
    }
    static int binarySearch(int[] arr, int target, int start,int end){


        while(start<=end){
            int mid = start+ (end- start)/2;

            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid= start + (end- start)/2;
            // 4 cases over here
            // MID SHOULD ALWAYS BE LESS THAN END
            if(mid< end && arr[mid]> arr[mid+1]){
                return mid;

            }
            if(arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid+1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
