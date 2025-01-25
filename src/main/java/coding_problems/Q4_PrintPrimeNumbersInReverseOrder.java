package coding_problems;

public class Q4_PrintPrimeNumbersInReverseOrder {
    public static void main(String[] args) {

        /**
         *  Print all prime numbers in reverse order from the input number
         */


        int input = 11;     // 11 7 3 2
        printPrimeNumsInReverseOrder(input);

    }

    private static boolean isPrime(int num){
        if(num < 2) return false;

        for(int i =2; i<= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    private static void printPrimeNumsInReverseOrder(int input) {

        for(int i = input; i>= 2; i--){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    // Q. Count the number of digits. int year = 2025  // 4
}
