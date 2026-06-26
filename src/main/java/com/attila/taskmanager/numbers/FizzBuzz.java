package com.attila.taskmanager.numbers;

public class FizzBuzz {

    public static void main(String[] args) {

        fizzBuzz(30);

    }

    public static void fizzBuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
