package coding_problems;

public class Q16_Merge2SortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        int n1 = arr1.length;
        int n2 = arr2.length;//op = [1,2,3,5,6,7,8]

        int[] result = new int [arr1.length + arr2.length];

        mergeArrays(arr1,arr2,n1, n2, result);  // TC : O(n)

        System.out.println("Array after merging");
        for(int i=0; i<n1+n2; i++){
            System.out.print(result[i]+" ");
        }

    }

    private static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] result) {

        int i=0, j=0, k=0;

        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }

        while(i< n1){
            result[k++] = arr1[i++];
        }

        while(j< n2){
            result[k++] = arr2[j++];
        }
    }
}
