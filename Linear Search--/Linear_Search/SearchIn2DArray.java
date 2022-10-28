package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {10, 5, 35,},
                {2, 6, 7, 12,7},
                {15, 45, 23},
                {33, 18}
        };

        int target = 23;
        int ans[] = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchIn2DArray(int[][] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
