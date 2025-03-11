package BinarySearchQuestions;

public class mountainArray {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]> arr[mid+1]){
                // u r in decreasing side of the array
                // this may be the answer but look at the left as well
                // this is y end != mid-1;
                end= mid;

            }else{
                //u r in ascending part of thr array;
                start = mid+1;
                // bcoz we know that mid+1 element is greater then mid element;
                //
            }
        }
        //int the end , start == end and pointing tho the largest nummber bcoz of the 2 checks above
        // start and end are always trying to find max elementin the abobe 2 checks
        //hence when they point to one element then that element is the max;
        return start;// return end;


    }
}
