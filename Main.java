package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        System.out.println("Nhap nam: ");
        Scanner scanner = new Scanner(System.in);
        boolean isLeapYear = true;
        year = scanner.nextInt();
        if(year %4 ==0 && year %100 !=0){
            isLeapYear = true;
        }
        else if(year %100 ==0 && year %400 !=0)
        {
                isLeapYear = false;
        }
        else if(year %100 ==0 && year %400 ==0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;

        }
        if(isLeapYear)
        {
            System.out.println(year + "is leap year");
        }
        else
        {
            System.out.println(year + "is not leap year");
        }
    }
}