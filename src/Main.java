public class Main {
    public static void main(String[] args) {
        //Задание 1

        for (int i = 1; i <= 10; i++)
        {System.out.print(i + " ");}
        System.out.println();

        for (int i = 10; i >= 1; i=i-1)
        {System.out.print(i + " ");}
        System.out.println();

        //Задание 2

        int friday = 4;

        for (;friday <= 31; friday=friday+7)
        {System.out.println("Сегодня пятница " +friday+ "-е число");}

        //Задание 3

        int currentYear = 2022;
        for (int year = currentYear - 200; year < currentYear + 100; year = year + 1)
        {if (year % 79 == 0)
        {System.out.println(year);}}





    }



    }
