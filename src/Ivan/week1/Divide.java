package Ivan.week1;

public class Divide {
    public static void main(String[] args) throws Exception {

        int divide=15;
        int div=divide;

        int divider=0;

        if (divider==0) {
            throw new Exception("divider can not be zero");

        }
        int coint=0;

        while (div>=divider){
            div-=divider;
            coint++;
        }

        System.out.println(divide+" / "+divider+" = "+coint);


    }
}
