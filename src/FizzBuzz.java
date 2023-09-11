/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            doFizzBuzz(i);
        }
    }

    public static void doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}

class FizzBuzz1{
    public static void main(String[] args){
        int number = 1;
        while(number < 100){
            boolean divisibleBy3 = number % 3 == 0;
            boolean divisibleBy5 = number % 5 == 0;

            if(divisibleBy3 && divisibleBy5){
                System.out.println("Fizz Buzz");
            }

            else if(divisibleBy3){
                System.out.println("Fizz");
            }

            else if(divisibleBy5){
                System.out.println("Buzz");
            }

            else{
                System.out.println(number);
            }

        }
    }
}
