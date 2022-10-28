package Linear_Search;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 8, 9, 15, 25, 56, 41, 35, -3};
        int target = 25;
        System.out.println(searchingInRange(arr, target, 2, 7));

    }

    static int searchingInRange(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

//        searching in range
        for (int i= start; i<= end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
