package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = myObj.nextDouble();
        double fahrenheit = (celsius * 9 / 5 ) + 32;
        System.out.print("Temperature in Fahrenheit: ");
        System.out.printf("%.2f", fahrenheit);
    }

}