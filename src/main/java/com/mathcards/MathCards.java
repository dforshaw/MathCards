package com.mathcards;

/**
 * This is the command line version of the MathCards app
 */

import java.util.Random;
import java.util.Scanner;

public class MathCards {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Random generate = new Random();
        Integer count = 3;
        Integer correct = 0;
        Integer problem, num1, num2, result, enteredValue;

        // Intro
        System.out.println("Welcome to Math Cards!");
        System.out.print("\nLet's start by practicing adding numbers with these " + count + " problems.");
        System.out.println("\tGood luck!!\n");

        // Generate questions

        for (int i = 0; i < count; i++) {

            problem = i + 1;
            num1 = generate.nextInt(6);
            num2 = generate.nextInt(6);
            result = num1 + num2;

            System.out.print("Problem #" + problem + ":\t");
            System.out.print(num1 + " + " + num2 + " = ");
            enteredValue = keyboard.nextInt();

            if (enteredValue == result) {
                System.out.println("\t\t\t\t\t\t\t***** CORRECT!!! GOOD JOB!!! *****");
                correct += 1;
            } else {
                System.out.println("\t\t\t\t\t\t\t***** Sorry, that is not the correct answer. *****");
            }
        }

        System.out.println("\nYou answered " + correct + " out of " + count + " problems correctly.");
    }
}

