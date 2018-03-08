package com.jetbrains;

import java.util.Scanner;

public class MultiplicationTables
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables");
        System.out.println();
        int size = 0;

        while (size > 20 || size < 1)
        {
            System.out.println("How large would you like to see them? Enter a number between 1 and 20");
            size = keyboard.nextInt();
            System.out.println();

           if (size > 20)
           {
               System.out.print("Error. That number is too large.");
               System.out.println();
           }
        }

        for (int counter = 0; counter <= size; counter++) {
            for (int counter2 = 0; counter2 <= size; counter2++)
            {
               System.out.println(counter + " * " + counter2 + " = " + (counter * counter2));
            }

        }
    }
}

