package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);
//        scanner class has multiple next functions like nextFloat, next and next line
//        when using next and nextLine the biggest diffrence is that when you use next it will only take the first entry of the line you have provided because it can assign only one token
//        so if you provide my name is using next() fn it will print my only
//        to rectify this we use nextLine so that it takes all the input from the line

        String name = scanner.next();
        System.out.println(name);
        String fullName = scanner.nextLine();
        System.out.println(fullName);
    }
}