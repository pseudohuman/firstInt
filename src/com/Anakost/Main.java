package com.Anakost;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private  static String createLine(int firstInt, int secondInt, String delimiter, ArrayList<String> list){
        String finalLine=list.get(firstInt-1);
        for (int num=(firstInt);num <(firstInt+secondInt);num++){
            finalLine=finalLine+delimiter+list.get(num);

        }
        return finalLine;
    }
    private static int getInt(Scanner sc){
        int integer=0;
        try {
            integer = Integer.parseInt(sc.next());
        }catch (Exception e){
            System.out.print("Не число.Введите число");
            getInt(sc);
        }
        return integer;

    }
    private static void getSLine(Scanner sc,List<String> stringList){
        String newLine="t";
        while(!(newLine.equals(""))){
            System.out.println("Введите любою строку");
            newLine=sc.nextLine();
            stringList.add(newLine);

            System.out.println(newLine);



        }
        stringList.remove(stringList.size()-1);
    }

    public static void main(String[] args) {
        int firstInteger;
        int secondInteger;
        ArrayList<String> stringList= new ArrayList<String>();
	    Scanner sc= new Scanner(System.in); // write your code here


        getSLine(sc,stringList);
        while (stringList.isEmpty()){
            System.out.println("Вы ничего не ввели");
            getSLine(sc,stringList);

        }
        System.out.println(stringList.isEmpty());


        System.out.println("Введите первое число");
        firstInteger=getInt(sc);
        while (firstInteger<=0){
            System.out.println("Число должно быть больше ноля!!!");
            firstInteger=getInt(sc);

        }
        while (firstInteger>stringList.size()){
            System.out.println("Это слишком МНОГО!!!");
            firstInteger=getInt(sc);

        }



        System.out.println("Введите второе число");
        secondInteger=getInt(sc);
        while (secondInteger<=0){
            System.out.println("Число должно быть больше ноля!!!");
            secondInteger=getInt(sc);

        }
        while (secondInteger+firstInteger>stringList.size()){
            System.out.println("Это слишком МНОГО!!!");
            secondInteger=getInt(sc);

        }

        System.out.println("Введите разделитель");
        String delimiter=sc.next();

        sc.close();
        System.out.println(createLine(firstInteger,secondInteger,delimiter,stringList));

    }
}
