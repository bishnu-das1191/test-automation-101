package coding_problems;

import java.util.HashMap;
import java.util.Map;

public class Q17_TwoSumProblem {
    public static void main(String[] args) {

        /**
         * Print the index pairs from array which is equals to target
         */

        int[] arr = {2, 7, 11, 15};   // o/p : [0,1]
        int target = 9;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("["+i+","+j+"]");  // TC: O(n^2)  //SC:O(1)
                }
            }
        }



    }
}

class TwoSum_Optimized {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};   // o/p : [0,1]
        int target = 9;

        // i+j=target // i = target-j
        Map<Integer, Integer> numMap = new HashMap<>();  //SC: O(n)

        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(numMap.containsKey(complement)){
                System.out.println("["+numMap.get(complement)+","+i+"]"); // TC : O(n)
            }
            numMap.put(arr[i],i);
        }

    }
}
