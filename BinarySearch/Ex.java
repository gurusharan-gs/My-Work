package BinarySearch;

public class Ex {

    public static void main(String[] args) {


        int[] arr = {2, 4, 7, 10, 10, 10, 12, 45, 50};
        int target = 10;
        System.out.println(order2(arr, target));


    }

    public static int order(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int res = -1; //4

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                res = mid; //4
                end = mid - 1; //3
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return res;
    }


    public static int order1(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
              return  mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static int order2(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int res = -1; //4

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                res = mid; //4
                start = mid + 1; //3
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return res;
    }

}
