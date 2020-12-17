package com.company;
//Класс для ввода данных извне
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        byte num = 23;
        //String str = "Hello World!"
//ОБъект класса Scanner
        // Создаем вызов функции для ввода данных
        Scanner str = new Scanner(System.in);
        //nextLine() нужно для того, чтобы можно было ввести входные данные в терминале (строковый тип данных) Line можно заменить ан int float
        System.out.println(str.nextLine());
    }
}
