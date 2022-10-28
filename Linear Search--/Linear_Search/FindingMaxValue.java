package Linear_Search;

public class FindingMaxValue {

    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 8, 9, 15, 25, 56, 41, 35, -3};
        System.out.println(findindMaxValue(arr));
    }

    static int findindMaxValue(int[] arr){

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
}
