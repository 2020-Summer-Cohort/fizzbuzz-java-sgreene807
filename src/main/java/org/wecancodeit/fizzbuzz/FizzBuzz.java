package org.wecancodeit.fizzbuzz;


public class FizzBuzz {

    public String say(int numberToTranslate) {

            if (numberToTranslate % 3 == 0 && numberToTranslate % 15 != 0) {
                return "Fizz";
            } else if (numberToTranslate % 5 == 0 && numberToTranslate % 15 != 0) {
                return "Buzz";

            }
            return "" + returnOwnNumber(numberToTranslate);

        }


        public static int returnOwnNumber ( int number){
            if ((number % 3 == 0 && number % 5 == 0) || number % 3 != 0 || number % 5 != 0) {
                return number;
            }
            return -1;
        }
    }






