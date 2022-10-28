package BinarySearch;

public class OccurrenceFind {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 10, 10, 10, 12, 16, 20, 23, 25};
        int target = 10;
        int ans = findOccurrence2(arr, target);
        System.out.println(ans);
    }


//    finding first occurrence of the array
    static int findOccurrence(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int res = - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                res = mid;
                end = mid - 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return res;
    }




    //    finding mideal occurrence of the array
    static int findOccurrence1(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }



    //    finding last occurrence of the array
    static int findOccurrence2(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int res = - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                res = mid;
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return res;
    }

}
