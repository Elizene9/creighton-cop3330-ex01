/*
 * UCF COP 3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Charlene Creighton
 */
package Exercise_1;

import java.util.Scanner;
/*
Exercise 1 - Saying Hello
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint
Keep the input, string concatenation, and output separate.
 */
public class ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nWhat is your name? ");

        var name = input.nextLine();

        String output = "Hello, " + name +", nice to meet you!";

        System.out.printf("%s", output);
    }
}
