package com.jetbrains;


import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

      //Goal Variables
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

     //How many items sold
        int soldVeggie;
        int soldBurgers;
        int soldSubs;
        int soldSoup;

        System.out.println("Checking sales goals");
        System.out.println();

        //VEGGIES

        System.out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        System.out.println("How many veggie sandwiches were sold today?");
        soldVeggie = keyboard.nextInt();

        //ADD IF ELSE STATEMENT FOR VEGGIE

        if (soldVeggie >= goalForVeggies)
        {
            System.out.print("Made goal");
        }

        else if (soldVeggie < goalForVeggies)
        {
            System.out.print("Fell short");
        }

            System.out.println();

        //BURGERS

        System.out.println("The sales goal for burgers is " + goalForBurgers);
        System.out.println("How many burgers were sold today?");
        soldBurgers = keyboard.nextInt();

        //ADD IF ELSE STATEMENT FOR BURGERS

        if (soldBurgers >= goalForBurgers)
        {
            System.out.print("Made goal");
        }

        else if (soldBurgers < goalForBurgers)
        {
            System.out.print("Fell short");
        }

        System.out.println();

        //SUBS

        System.out.println("The sales goal for subs is " + goalForSubs);
        System.out.println("How many subs were sold today?");
        soldSubs = keyboard.nextInt();

        //ADD IF ELSE STATEMENT FOR SUBS

        if (soldSubs >= goalForSubs)
        {
            System.out.print("Made goal");
        }

        else if (soldSubs < goalForSubs)
        {
            System.out.print("Fell short");
        }

        System.out.println();

        //SOUP

        System.out.println("The sales goal for soup is " + goalForSoup);
        System.out.println("How many soups were sold today");
        soldSoup = keyboard.nextInt();

        //ADD IF ELSE STATEMENT FOR SOUPS

        if (soldSoup >= goalForSoup)
        {
            System.out.print("Made goal");
        }

        else if (soldSoup < goalForSoup)
        {
            System.out.print("Fell short");
        }

        System.out.println();

        //ADD IF ELSE STATEMENT FOR OVERALL SALES GOALS - FELL SHORT, MEETS GOALS, MADE GOAL FOR EVERYTHING
        //OR DIDN'T MAKE GOAL SO NOTHING SHOWS UP

        if (soldVeggie >= goalForVeggies && soldBurgers >= goalForBurgers && soldSubs >= goalForSubs && soldSoup >= goalForSoup)
        {
            System.out.print("Made goal for everything");
        }
        if (soldVeggie < goalForVeggies || soldBurgers < goalForBurgers || soldSubs < goalForSubs || soldSoup < goalForSoup)
        {
            System.out.print("");
        }






    }
}