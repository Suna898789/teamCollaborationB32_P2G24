package week3.Elmehdi;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = isPrime(num);

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
