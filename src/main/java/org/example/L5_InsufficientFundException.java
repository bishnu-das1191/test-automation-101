package org.example;

public class L5_InsufficientFundException extends Exception {

    public L5_InsufficientFundException(String message) {
        super(message);
    }
}

class L5_ExceptionDemoTest {
    public static void main(String[] args) {

        L4_Account acc = new L4_Account();
        acc.setBalance(10000.0);

        try {
            System.out.println("Current Balance : "+acc.getBalance());
            acc.withdraw(4000.0);
            System.out.println("Withdraw successful");
            System.out.println("Rem Balance : "+acc.getBalance());
        } catch (L5_InsufficientFundException e) {
            System.out.println(e.getMessage());
        }

        // handle an exception with our custom exception class

        try {
            acc.withdraw(10000.0);
        } catch (L5_InsufficientFundException e) {
            e.printStackTrace();
        }


    }
}
