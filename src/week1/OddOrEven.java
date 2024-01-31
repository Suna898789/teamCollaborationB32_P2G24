public class EvenOROdd {

    public static void main(String[] args) {

        int number=0;


        if (number%2==0 && number>0){
            System.out.println("Number is even "+number);
        }else if(number%2!=0){
            System.out.println("Number is odd "+number);
        }else{
            System.out.println("Number is equal to zero "+number);
        }

    }

}
