package com.jetbrains;

public class Temperatures
{
    public static void main(String[] args)
    {

        int temps[][] = new int[4][7];

        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        System.out.print("7:00 AM: ");

        for (int row = 0; row < temps[0].length; row++)
            System.out.print(temps[0][row] + " ");
            System.out.print("\n");

       System.out.print("3:00 PM: ");

        for (int row = 0; row < temps[1].length; row++)
            System.out.print(temps[1][row] + " ");
            System.out.print("\n");

        System.out.print("7:00 PM: ");

        for (int row = 0; row < temps[2].length; row++)
            System.out.print(temps[2][row] + " ");
            System.out.print("\n");

        System.out.print("3:00 AM: ");

        for (int row = 0; row < temps[3].length; row++)
            System.out.print(temps[3][row] + " ");

        System.out.println();
        System.out.println();


        float columnTotal1 = 0;
        for (int column = 0; column < temps.length; column++)
        {
            columnTotal1 += temps[column][0];
        }
        float sunAverage = (columnTotal1 / 4);
        System.out.println("The average temperature for Sunday is: " + sunAverage);


        float columnTotal2 = 0;
        for (int column = 0; column < temps.length; column++)
        {
            columnTotal2 += temps[column][1];
        }
        float monAverage = (columnTotal2 / 4);
        System.out.println("The average temperature for Monday is: " + monAverage);

        float columnTotal3 = 0;
        for (int column = 0; column < temps.length; column++)
        {
            columnTotal3 += temps[column][2];
        }
        float tuesAverage = (columnTotal3 / 4);
        System.out.println("The average temperature for Tuesday is: " + tuesAverage);


        float columnTotal4 = 0;
        for (int column = 0; column < temps.length; column++)
        {
            columnTotal4 += temps[column][3];
        }
        float wedAverage = (columnTotal4 / 4);
        System.out.println("The average temperature for Wednesday is: " + wedAverage);


        float columnTotal5 = 0;
        for (int column = 0; column < temps.length; column++)
        {
            columnTotal5 += temps[column][4];
        }
        float thursAverage = (columnTotal5 / 4);
        System.out.println("The average temperature for Thursday is: " + thursAverage);

        float columnTotal6 = 0;
        for (int column = 0; column < temps.length; column++)
        {
            columnTotal6 += temps[column][5];
        }
        float friAverage = (columnTotal6 / 4);
        System.out.println("The average temperature for Friday is: " + friAverage);


        float columnTotal7 = 0;
        for (int column = 0; column < temps.length; column++)
        {
            columnTotal7 += temps[column][6];
        }
        float satAverage = (columnTotal7 / 4);
        System.out.println("The average temperature for Saturday is: " + satAverage);


        float rowTotal1 = 0;
        for (int row = 0; row < temps[0].length; row++)
        {
            rowTotal1 += temps[0][row];
        }
        float time7aAverage = (rowTotal1 / 7);
        System.out.println("The average temperature for 7:00 AM is: " + time7aAverage);


        float rowTotal2 = 0;
        for (int row = 0; row < temps[1].length; row++)
        {
            rowTotal2 += temps[1][row];
        }
        float time3pAverage = (rowTotal2 / 7);
        System.out.println("The average temperature for 3:00 PM is: " + time3pAverage);

        float rowTotal3 = 0;
        for (int row = 0; row < temps[2].length; row++)
        {
            rowTotal3 += temps[2][row];
        }
        float time7pAverage = (rowTotal3 / 7);
        System.out.println("The average temperature for 7:00 PM is: " + time7pAverage);


        float rowTotal4 = 0;
        for (int row = 0; row < temps[3].length; row++)
        {
            rowTotal4 += temps[3][row];
        }
        float time3aAverage = (rowTotal4 / 7);
        System.out.println("The average temperature for 3:00 AM is: " + time3aAverage);


        float weeklyAverage = ((rowTotal1 + rowTotal2 + rowTotal3 + rowTotal4)/28);
        System.out.println("The total weekly average is: " + weeklyAverage);

    }

}
