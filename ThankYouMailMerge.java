package com.jetbrains;

import java.util.Scanner;

public class ThankYouMailMerge
{
    public static void main (String[] args)
    {

        String fullname;
        float donation;
        boolean keepGoing = true;

        System.out.println("----Thank You Letters----");

        while (keepGoing)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter donor's first and last name");
            fullname = keyboard.nextLine();


        if (fullname.equals("quit"))
        {
            keepGoing = false;
        }

        else
            {
            System.out.println("Please enter the amount of " + fullname + "'s donation");
            donation = keyboard.nextFloat();

            System.out.println("Dear " + fullname + ",");
            System.out.println("");
            System.out.println("Thank you for your donation!  We rely on donors like you to keep our");
            System.out.println("organization effective, and you came through for us.  Your donation of $" + donation);
            System.out.println("will help our efforts to make a difference in the world.");
            System.out.println("");
            System.out.println("As you may know, we are a registered non-profit organization, so your");
            System.out.println("donation is tax deductible.  You may use this letter as a receipt for tax");
            System.out.println("purposes.");
            System.out.println("");
            System.out.println("Thank you again for your support!");
            System.out.println("");
            System.out.println("Sincerely,");
            System.out.println("Paula Jones");
            System.out.println("YourCharity.org");

            }
        }
    }
}
