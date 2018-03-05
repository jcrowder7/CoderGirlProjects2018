package com.jetbrains;

import java.util.Scanner;

public class MultiplicationTables
{
    public static void multiplication(int x)
    {
        for (int counter = 0; counter <= x; counter++)
        {
            for (int counter2 = 0; counter2 <= x; counter2++)
            {
                int y = counter * counter2;
                System.out.println(counter + " * " + counter2 + " = " + y);
            }

        }
    }

    public static void main(String[] args)
    {

        System.out.println("Welcome to Multiplication Tables");
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        boolean keepGoing = true;

        while (keepGoing)
        {
            System.out.println("How large would you like to see them? Enter a number between 0 and 20");
            number = keyboard.nextInt();
            multiplication(number);
            System.out.println();


            if (number > 20)
            {
                keepGoing = false;
                System.out.print("Error. That number is too large.");
                System.out.println();
            }
        }

    }


}
