public class celing {
    public static void main(String[] args) {
        int [] arr = {1,2,3,33,44,66,77,88,89,92,95};
        int target= 91;
        System.out.println(Celing(arr,target));

    }
    static int Celing(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
            int mid = start+ (end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            }
            else if (target< arr[mid]) {
                end = mid-1;

            }
            else{
                return mid;
            }
        }
        return start;

    }
}
