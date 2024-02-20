package main.java.haden.week_01;

public class Q1 {

    public static void main(String[] args) {
        System.out.println(identifyOddEven(4));
        System.out.println(identifyOddEven(5));
    }

    public  static  String  identifyOddEven( int  n ) {
        return  n%2==0 ? "Even" : "Odd" ;
    }

}
