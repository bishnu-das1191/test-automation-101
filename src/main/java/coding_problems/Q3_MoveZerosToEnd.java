package coding_problems;

import java.util.Arrays;

public class Q3_MoveZerosToEnd {
    public static void main(String[] args) {

        /**
         *  Move all zeros to the end of an array, without creating a new array.
         *
         *  Move all zeros to the start of an array, without creating a new array.
         *
         *  S.C : O(1)
         */

        int[] arr = {3,0,2,0,8,0,0,6,9};

        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        //System.out.println(Arrays.toString(arr));
        //System.out.println(index);

        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
