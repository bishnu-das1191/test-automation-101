package org.example.oopsTopics;

public class PolymorphismTest {

   public void testingM1(){
       System.out.println("m1");
   }

    public void testingM1(int num){
        System.out.println("m1 with 1 param ");
    }

    public void testingM1(int num, int num2){
        System.out.println("m1 with 2 param ");
    }

    public void testingM1(int num, String num2){
        System.out.println("m1 with 2 diff param ");
    }

    public void testingM1(String num2, int num){
        System.out.println("m1 with diff sequence param ");
    }

    /*public void testingM1(String num2, int num){
        System.out.println("m1 with diff sequence param ");
        //return 0;
    }*/
}
