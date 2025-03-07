package BinarySearchQuestions;
// AMAZON QUESTION
public class InfinitesortedArray {
    public static void main(String[] args) {
        int [] arr = {3,5,7,9,10,90,100,120,130,140,150,160};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr, int target){
        // FIND THE RANGE
        // FIRST START SEARCHING RANGE WITH BOX OF SIZE 2;
        int start =0;
        int end = 1;

        // CONDITION FOR THE TARGET TO LIE IN THE RANGE;
        while(target> arr[end]){
            int newStart = end+1;
            // double the box value
            // end = previous end+ size of box *2;
            end = end+(end -start +1)*2;
            start = newStart;
        }
        return (binarySearch(arr,target, start, end));

    }
    static int binarySearch(int [] arr, int target, int start, int end){
        while(start<= end){
            int mid = start + (end-start)/2;

            if(target< arr[mid]){
                end = mid-1;
            }
            else if(target> arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
