package week2;

import java.util.ArrayList;

public class DivisibleBy3By5By15_kelly {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 100; i++) { //iterate through 100 numbers
            nums.add(i);
        }

        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        ArrayList<Integer> divisibleBy15 = new ArrayList<>();




        for (Integer each : nums) {
            //-> All elements divisible by 15

            if (each % 15 == 0 && each % 5 == 0 && each % 3 == 0) {
                divisibleBy15.add(each);
            }

            //-> All elements divisible by 5
            if (each % 5 == 0 && each % 15 != 0) {
                divisibleBy5.add(each);
            }


            // -> All elements into the divisible by 3
            if (each % 3 == 0 && each % 15 != 0) {
                divisibleBy3.add(each);
            }
        }

        System.out.println("Numbers: " + nums);
        System.out.println("Divisible by 15: " + divisibleBy15);
        System.out.println("Divisible by 5: " + divisibleBy5);
        System.out.println("Divisible by 3: " + divisibleBy3);


    }
}




/*
 **JAVA CODING TASKS -WEEK 2

 **Numbers -- Divisible by 3, 5, 15**
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
-if the number can be divisible by 3, 5 and 15, then it should only be displayed in Divisible By 15 section
-if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisible By 3 section
-if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in Divisible By 5 section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

 */

