package com.google;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner week = new Scanner(System.in);
        System.out.println("Введите факториал числа: ");
        String number = week.nextLine();
        int number1 = Integer.parseInt(number);

        int result = 1;
        for (int i = 1; i <= number1; i++) {
            result = result * i;}
            if (result > 1000) {
            System.out.println("Достигнут максимально возможный результат");}
            if (result < 1000) {
            System.out.println("Результат: " + result);}
            }





        }





//4. Написать программу, которая считает факториал числа и выводит
//промежуточные значения на экран.
//Условие: если промежуточное значение >1000, завершить цикл предварительно
//написав в консоли “Достигнут максимально возможный результат”.