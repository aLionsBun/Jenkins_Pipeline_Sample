package com.mycompany.app;

public class App {
    private static final int[] numbers = [1, 3, 5, 0];

    public App() {}

    public static void main(String[] args) {
        for(int i=0; i<numbers.length; i++) {
            System.out.println(play(numbers[i]));
        }
    }

    public String play(int number) {
        if (number == 0) return "Fizz Buzz!";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";

        return String.valueOf(number);
    }
}
