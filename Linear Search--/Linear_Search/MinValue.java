package Linear_Search;

public class MinValue {

    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 8, 9, 15, 25, 56, 41, 35, -3};
        System.out.println(findindMinValue(arr));
    }

//    finding the minimum value in the array
    static int findindMinValue(int[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;
    }
}
