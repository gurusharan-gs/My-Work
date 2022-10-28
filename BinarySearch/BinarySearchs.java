package BinarySearch;

public class BinarySearchs {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 12, 16 ,23, 27, 30};
        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
