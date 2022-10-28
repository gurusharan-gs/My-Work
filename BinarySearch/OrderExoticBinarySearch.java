package BinarySearch;

//Order Exotic Binary Search

public class OrderExoticBinarySearch {

    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 8, 12, 15, 19, 24, 27, 31};
        int[] arr = {55, 45, 32, 17, 12, 9, 7, 6, 2, 0};
        int target = 7;
        int ans = orderExoticBinarySearch(arr, target);
        System.out.println(ans);
    }

    public static int orderExoticBinarySearch (int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }

       while (start <= end){

           int mid = start + (end - start) / 2;
           if (target == arr[mid]){
               return mid;
           }

           if(isAsc){
               if (target > arr[mid]){
                   start = mid + 1;
               } else if (target < arr[mid]) {
                   end = mid - 1;
               }
           }else {
               if (target < arr[mid]){
                   start = mid + 1;
               } else if (target > arr[mid]) {
                   end = mid - 1;
               }
           }
       }
       return -1;
    }
}
