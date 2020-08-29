package com.google;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner week = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String day = week.nextLine();

        String mounth = "Вторник";

        switch (mounth) {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятнца":
                System.out.println("Рабочий день");
                break;
            case "Суббота":
            case "Воскресенье":
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Такого значения нет, выберите другое!");


        }
    }
}

