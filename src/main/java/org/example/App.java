package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*int[] arr = new int[5];

        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);*/

/*
        int[] arr = {1,5,0,4,9,15};

        System.out.println(arr[arr.length-1]);


        for(int value : arr){
            System.out.print(value+" ");
        }

        for(int i = 0; i<arr.length; i++){     // O(n)
            System.out.println(arr[i]);
        }


        for(int i = 1; i<=100; i++){     // O(1)
            System.out.println(i);
        }

        int num1 = 100;
        int num2 = 100000;
        System.out.println(num1 + num2);    // O(1)

        // program to print sum of 1st 50 numbers
        int sum = 0;
        int lastNum = 50;
        for(int i=1; i<=lastNum; i++){  // O(n)
            sum += i;
        }
        System.out.println(sum);

        System.out.println((50*(50+1)/2));  // O(1)*/

        int[] a = {1,4,2,5,6,3};

        System.out.println(a); // this will call toString method present in Object class
        System.out.println(Arrays.toString(a)); // toString() is overridden from Object class


        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {8,2,3,7},
                {7,4,7,4}
        };

        for(int[] outer : arr){
            for(int value : outer){
                System.out.print(value+" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));

        // copy of range method from Arrays class

        // try to print this 2d array arr using index for loop







    }
}
