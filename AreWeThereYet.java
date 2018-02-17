package com.jetbrains;

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String thereYet = "" ;
        boolean keepGoing = true;

        while (keepGoing == true)
        {
            System.out.print("Are we there yet?  ");
            thereYet = keyboard.nextLine();

            if (thereYet.equals("yes"))
            {
                keepGoing = false;
            }

            if (!thereYet.equals("yes") && !thereYet.equals("no"))
            System.out.println("Huh? I didn't understand that.");
        }
        System.out.println("Yay!");
    }
}
