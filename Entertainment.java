package com.jetbrains;

import java.util.Scanner;



public class Entertainment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Weather Variables
        String weather;
        String sunny = "sunny";
        String cloudy = "cloudy";
        String rainy = "rainy";

        //Mood Variables
        String mood;
        String exercise = "exercise";
        String party = "party";
        String quiet = "quiet";

        System.out.println("What is the weather like today? Answer: sunny, cloudy or rainy");
        weather = keyboard.nextLine();

        if (!weather.equals(sunny) && !weather.equals(cloudy) && !weather.equals(rainy)) {
            System.out.print("Error: Your weather answer wasn't one of the valid options.");
        } else {

            System.out.println("What kind of mood are you in for activities? Answer: exercise, party or quiet.");
            mood = keyboard.nextLine();

            if (!mood.equals(exercise) && !mood.equals(party) && !mood.equals(quiet)) {
                System.out.print("Error: Your mood answer wasn't one of the valid options.");
            }


            //sunny & exercise
            if (weather.equals(sunny) && mood.equals(exercise)) {
                System.out.print("For exercise on a sunny day, try a brisk walk in a nature preserve.");
            }

            //sunny & party
            if (weather.equals(sunny) && mood.equals(party)) {
                System.out.print("For a fun party on a sunny day, look for a street festival.");
            }

            //sunny & quiet
            if (weather.equals(sunny) && mood.equals(quiet)) {
                System.out.print("A sunny day is a beautiful time to sit under a tree and read a book.");
            }

            //cloudy & exercise
            if (weather.equals(cloudy) && mood.equals(exercise)) {
                System.out.print("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
            }

            //cloudy & party
            if (weather.equals(cloudy) && mood.equals(party)) {
                System.out.print("For a fun party on a cloudy day, ride the paddle boats at the park.");
            }

            //cloudy & quiet
            if (weather.equals(cloudy) && mood.equals(quiet)) {
                System.out.print("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
            }

            //rainy & exercise
            if (weather.equals(rainy) && mood.equals(exercise)) {
                System.out.print("Giant indoor trampolines are a fun place to exercise on a rainy day.");
            }

            //rainy & party
            if (weather.equals(rainy) && mood.equals(party)) {
                System.out.print("See if your friends are playing board games to pass a rainy day.");
            }

            //rainy & quiet
            if (weather.equals(rainy) && mood.equals(quiet)) {
                System.out.print("A rainy day is a peaceful time to journal and daydream.");
            }

            //ERROR X 2


            //THIS KIND OF WORKS BUT STILL ASK BOTH QUESTIONS AND IF DOESN'T GET SET FORTH RESPONSES ON BOTH KICKS ERROR
            // else
            // {
            //    System.out.print("Error: Your weather answer wasn't one of the valid options");
            //}


            //   {
            //     System.out.print("Error: Your weather answer wasn't one of the valid options");
            //   System.out.print("Error: Your mood answer wasn't one of the valid options");
            //}

        }
    }
}
