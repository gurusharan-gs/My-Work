package Linear_Search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {12, 4, -8, 52, 44, 8, 6, -2, 5, 36, 15};
        int target = 52;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

//    finding index in the arr
    static int linearSearch(int[] arr, int target){

//        search in the array : return the index if item found
//        otherwise if item not found return -1
        if(arr.length == 0){
            return -1;
        }

//        run for loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
//        this line will execute if none if the return stataments above have executed
//        hence target not found
        return -1;
    }

//========================================================================

//    finding element in the array
    static int linearSearch1(int[] arr, int target){

//        search in the array : return the index if item found
//        otherwise if item not found return -1
        if(arr.length == 0){
            return -1;
        }

//        run for loop
        for (int element : arr) {
            if(element == target){
                return element;
            }
        }
//        this line will execute if none if the return stataments above have executed
//        hence target not found
        return -1;
    }


//========================================================================

    //    finding boolean value ture / false in the array
    static boolean linearSearch2(int[] arr, int target){

//        search in the array : return the index if item found
//        otherwise if item not found return -1
        if(arr.length == 0){
            return false;
        }

//        run for loop
        for (int element : arr) {
            if(element == target){
                return true;
            }
        }
//        this line will execute if none if the return stataments above have executed
//        hence target not found
        return false;
    }
}
