package week3;

public class PrimeNumber_kelly {

    static void primeNumber(int num) {
        int temp = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                temp++;
                break;
            }
        }

        if (temp == 0) {
            System.out.println("Number is prime " + num);
        } else {
            System.out.println("Number is not prime " + num);
        }
    }


    public static void main(String[] args) {

        primeNumber(11);
    }

}

/*
Write a method that can check if a number is prime or not
 */

