package ru.iitdgroup.temperaturegames;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        final int tableNum = 10;
        System.out.print("   |");
        for(int a = 1; a <= tableNum; a++)
            System.out.print(addSpace(a) + " ");
        System.out.println();
        System.out.print("---");
        for(int a = 1; a <= tableNum; a++)
            System.out.print("----");
        System.out.println();
        for(int a = 1; a <= tableNum; a++)
        {
            System.out.print(addSpace(a) + "|");
            for(int b = 1; b <= tableNum; b++)
            {
                System.out.print(addSpace(a * b) + " ");
            }
            System.out.println();
        }
    }

    public static String addSpace(int y)
    {
        String str;
        if(y < 10) str = "  " + y;
        else if(y < 100) str = " " + y;
        else str = "" + y;
        return str;
    }
}