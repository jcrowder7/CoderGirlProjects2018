package com.jetbrains;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please list three items on your grocery shopping list.");
        System.out.println();

        String itemone;
        System.out.print("Item 1? ");
        itemone = keyboard.nextLine();

        String itemtwo;
        System.out.print("Item 2? ");
        itemtwo = keyboard.nextLine();

        String itemthree;
        System.out.print("Item 3? ");
        itemthree = keyboard.nextLine();
        System.out.println();

        System.out.println("Now, please enter the quantity of each item.");
        System.out.println();

        Integer itemonequantity;
        System.out.print("How many " + itemone + "? ");
        itemonequantity = keyboard.nextInt();

        Integer itemtwoquantity;
        System.out.print("How many " + itemtwo + "? ");
        itemtwoquantity = keyboard.nextInt();

        Integer itemthreequantity;
        System.out.print("How many " + itemthree + "? ");
        itemthreequantity = keyboard.nextInt();
        System.out.println();

        System.out.println("Now, please enter the price of each item.");
        System.out.println();

        Float itemonecost;
        System.out.print("How much does one " + itemone + " cost? ");
        itemonecost = keyboard.nextFloat();

        Float itemtwocost;
        System.out.print("How much does one " + itemtwo + " cost? ");
        itemtwocost = keyboard.nextFloat();

        Float itemthreecost;
        System.out.print("How much does one " + itemthree + " cost? ");
        itemthreecost = keyboard.nextFloat();
        System.out.println();

        System.out.println("Calculating your grocery bill.");
        System.out.println();

        Float cost1;
        cost1 = itemonequantity * itemonecost;

        Float cost2;
        cost2 = itemtwoquantity * itemtwocost;

        Float cost3;
        cost3 = itemthreequantity * itemthreecost;

        Float totalcost;
        totalcost = cost1 + cost2 + cost3;

        System.out.print("Your total cost is " + totalcost);
    }
}


