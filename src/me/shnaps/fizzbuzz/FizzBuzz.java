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
        System.out.print("\n" + i + " : ");
        if ((i % 3 == 0) && (i % 5 == 0)) {
            System.out.print("FizzBuzz ");
        }
        if (i % 3 == 0) {
            System.out.print("Fizz ");
        }
        if (i % 5 == 0) {
            System.out.print("Buzz ");
        }
        fizzBuzzLoad(i + 1);
    }

}
