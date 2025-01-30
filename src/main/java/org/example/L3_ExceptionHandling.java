package org.example;

import java.util.concurrent.ExecutionException;

public class L3_ExceptionHandling {
    public static void main(String[] args) {
       /* try {
            System.out.println(5 / 0);
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Invalid Number");
        }*/


       /* try {
            System.out.println(5 / 0);
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("Invalid Number");
        }
*/

       /* try{
            System.out.println(5/0);
            System.out.println("In try");
        }catch (Exception e){
            System.out.println("Exception is Handled");
            System.exit(0);
        }finally {
            System.out.println("In finally");
        }*/

       /* try{
            System.out.println(5/0);
        }finally {
            System.out.println("in finally");
        }*/

        /*finally {

        }*/

        try{
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println("1st");
        }catch (RuntimeException e){
            System.out.println("2nd");
        }catch (Exception e){
            System.out.println("3rd");
        }
    }
}
