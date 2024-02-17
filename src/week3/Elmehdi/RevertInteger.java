package week3.Elmehdi;

public class RevertInteger {
    public static int revertNumber(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }


    public static void main(String[] args) {

        System.out.println(revertNumber(-10));

    }
}
