package coding_problems;

public class Q6_ReverseString_Variation2 {
    public static void main(String[] args) {

        /**
         *  Reverse a String without changing the position of the spaces
         *  String str = "I am XYZ";
         *  or
         *  Reverse a String without changing the position of the special characters
         *  String str = "I@am#%XY&Z";
         */

        String str = "I am XYZ";  //Z YX maI
        char[] strArr = str.toCharArray();

        int i = 0;
        int j = strArr.length-1;

        while(i<j){
            if(strArr[i] == ' '){
                i++;
            } else if (strArr[j] == ' ') {
                j--;
            }else{
                char temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(String.valueOf(strArr));

    }
}
