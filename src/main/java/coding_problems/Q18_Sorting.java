package coding_problems;

import javax.sound.midi.Soundbank;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Q18_Sorting {
    public static void main(String[] args) {

        String[] names = {"John","Alice","Alex","Bob","David"};
        Arrays.sort(names);
        System.out.println("Sorted Array : "+ Arrays.toString(names));

        int[] numbers = {5,3,8,2,1,9,4};
        Arrays.sort(numbers);
        System.out.println("Sorted Num Array : "+ Arrays.toString(numbers));

        // sort the part of array
        int[] num = {5,3,8,2,1,9,4};
        Arrays.sort(num, 2, 5);
        System.out.println("Sorted Num Array : "+ Arrays.toString(num));

        /**
         *  using Bubble sort without using predefined sort method
         */

        int[] numbersArr = {5,3,8,2,10,9,5,10};
        System.out.println("Using Bubble Sort, Asc Order : ");
        System.out.println(Arrays.toString(bubbleSort(numbersArr)));

        int[] numDsc = {5,3,8,2,10,9,5,10};
        System.out.println("Using Bubble Sort, Desc Order : ");
        System.out.println(Arrays.toString(bubbleSortDesc(numDsc)));

        // sort the list or collections
        List<Integer> number1 = new ArrayList<>(Arrays.asList(5,3,8,2,1,9,4));
        Collections.sort(number1);
        System.out.println("Sorted List (Ascending): "+number1);

        // sort the list or collections in desc order
        List<Integer> number2 = new ArrayList<>(Arrays.asList(5,3,8,2,1,9,4));
        Collections.sort(number2, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): "+number2);

        // sort the list of names based on their length in ASC
        List<String> names2 = new ArrayList<>(Arrays.asList("John","Alice","Bob","David","Eve"));

        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        Collections.sort(names2,lengthComparator);
        System.out.println("Sorted List by Length (ASC): "+names2);

        // sort the list of names based on their length in DESC
        List<String> names3 = new ArrayList<>(Arrays.asList("John","Alice","Bob","David","Eve"));

        Comparator<String> lengthComparator2 = Comparator.comparingInt(String::length).reversed();
        Collections.sort(names3,lengthComparator2);
        System.out.println("Sorted List by Length (DESC): "+names3);

    }

    private static int[] bubbleSortDesc(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j= 0; j<n-i-1; j++){
                if(arr[j] < arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j= 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }


}
