/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input1.nextInt();





        if (age >= 16 ) {
            System.out.printf("You can legally drive");


        } else {
            System.out.printf("You may not legally drive");
        }
    }








}
