package me.shnaps.fizzbuzz;

public class FizzBuzz {
    private int count;

    private FizzBuzz(int i) {
        count = i;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        fizzBuzz.fizzBuzzLoad(fizzBuzz.count);
    }

    private void fizzBuzzLoad(int i) {
        if (i > 100) {
            return;
        }
        if (i % 15 == 0) {
            System.out.println("Number is: " +  i + " -- FizzBuzz");
        } else {
            if (i % 3 == 0) {
                System.out.println("Number is: " +  i + " -- Fizz");
            } else {
                if (i % 5 == 0) {
                    System.out.println("Number is: " +  i + " -- Buzz");
                }
            }
        }
        if (i % 3 != 0 && i % 5 != 0) {
            System.out.println("Number is: " + i);
        }

        fizzBuzzLoad(i + 1);
    }

}
