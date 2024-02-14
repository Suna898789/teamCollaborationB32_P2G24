package week3;

public class ReverseNegativeNumber_kelly {
    public static int reverseNegativeNumber(int num) {
        if (num < 0) {
            return -num; // ->assign negative value if num<0

        } else {
            return num; // ->num remains positive
        }
    }

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-15));
    }
}

/*
Write a return method that can reverse negative number and return it as int
 */

