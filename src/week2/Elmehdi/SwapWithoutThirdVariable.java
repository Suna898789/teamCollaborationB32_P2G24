package src.week2.Elmehdi;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("swap: a = " + a + ", b = " + b);
    }
}

