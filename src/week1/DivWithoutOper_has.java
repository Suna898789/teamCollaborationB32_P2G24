package week1;

public class DivWithoutOper_has {

    public static void divWithoutOperator(int num1, int num2){

        if(num2 == 0){
            System.err.println("CAN NOT DIVIDE BY ZERO");
            return;
        }

        int count = 0;
        String result = num1+"/"+num2+" = ";
        String remainder = num1+"%"+num2+" = ";

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(result +count + "\n"+remainder + num1);
    }

}
