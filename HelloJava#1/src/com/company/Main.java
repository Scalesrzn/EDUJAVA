package com.company; //Пакет
//Класс для ввода данных извне
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        byte num = 23;
//        System.out.println("Hello World!");
//        //String str = "Hello World!"
//        //ОБъект класса Scanner
//        // Создаем вызов функции для ввода данных
//        Scanner str = new Scanner(System.in);
//        //nextLine() нужно для того, чтобы можно было ввести входные данные в терминале (строковый тип данных) Line можно заменить ан int float
//        System.out.println(str.nextLine());
//        System.out.println("Enter FNum:");
// Работа со строками и вводимыми переменными
//____________________________________________
//        String sFstring, sSString, sResult;
//        Scanner num = new Scanner(System.in);
//        System.out.print("Enter First String:");
//        sFstring = num.next();
//        System.out.print("Enter Second String:");
//        sSString = num.next();
//        sResult = sFstring + " " + sSString;
//        System.out.print("Result: " + sResult);
//---------------------------------------------
//Поработаем с условными операторами
//____________________________________________
        Scanner sChar = new Scanner(System.in);
        String sChVar;
        System.out.print("Введите текст, а я проверю: ");
        sChVar = sChar.next();
        if (sChVar.equals("Hello"))
            System.out.print("World");
        else
            System.out.print("Вы ввели :"+sChVar);
    }
}
