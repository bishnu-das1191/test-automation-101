package org.example.oopsTopics;

public class ClsB extends ClsA{

    int balance = 20000;

    public void callMe(){
        System.out.println("From B");
    }

    public static void callMe3(){
        System.out.println("from child static mtd");
    }
}

class DemoPloymorphismTest {

    public static void main(String[] args) {

      /*  ClsA obj = new ClsA();
        obj.callMe();*/

        /*ClsB obj1 = new ClsB();
        obj1.callMe();*/

       /* ClsA obj = new ClsB();
        obj.callMe2();
        obj.callMe();*/

        /*
        ClsB obj = new ClsA();
        obj.callMe();*/

       /* ClsA obj = new ClsB();
        obj.callMe3();*/

        ClsA obj = new ClsB();
        System.out.println(obj.balance);



    }
}
