package Ivan.week1;

public class Divide {
    public static void main(String[] args) {

        int divide=15;
        int div=divide;

        int divider=3;

        int coint=0;

        while (div>=divider){
            div-=divider;
            coint++;
        }

        System.out.println(divide+" / "+divider+" = "+coint);


    }
}
