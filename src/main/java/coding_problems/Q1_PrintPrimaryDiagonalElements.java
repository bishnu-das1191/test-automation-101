package coding_problems;

public class Q1_PrintPrimaryDiagonalElements {

    public static void main(String[] args) {

        /**
         *   Print the sum of primary diagonal elements
         */

        int[][] matrix = {
                {1,4,8},
                {0,5,7},
                {9,4,4}

        };

       /* System.out.println(matrix.length);
        System.out.println(matrix[0].length);*/

        int sum = 0;
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){        // T.C : O(n^2)
               if(i == j){
                    sum += matrix[i][j];
               }
            }
        }
        System.out.println(sum);


        // optimized solution
        int result = 0;
        for(int i =0; i<matrix.length; i++){     // T.C :  O(n)
            result += matrix[i][i];
        }

        System.out.println(result);

        // print sum if anti diagonal elements




    }
}
