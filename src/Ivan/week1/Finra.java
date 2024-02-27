package Ivan.week1;

public class Finra {
    public static void main(String[] args) {

        for (int i = 1; i <31 ; i++) {
            if (i%15==0){ System.out.println("FINRA");
                continue;}
            if (i%3==0){ System.out.println("FI");
                continue;}
            if (i%5==0){ System.out.println("RA");
                continue;}
            System.out.println(i);
        }

    }
}

/*
 FINRA :
Write a method which prints out the numbers from 1 to 30, but print "FIN" instead of numbers for multiples of 3, "RA" instead of numbers for numbers that are multiples of 5, and a multiple of both 3 and 5 for
 */
