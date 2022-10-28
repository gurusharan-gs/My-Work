package Linear_Search;

public class SearchInChar {

    public static void main(String[] args) {
        String str = "Gurusharan";
        char target = 'u';
        boolean ans = searchInChar(str, target);
        System.out.println(ans);
    }

    static boolean searchInChar(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()) {
//            toCharArray : to convert thr string char to array
            if (ch == target){
                return true;
            }
        }
        return false;
    }

}
