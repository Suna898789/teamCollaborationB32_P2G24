package week3.Elmehdi;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(2));


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
