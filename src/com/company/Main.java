package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        programManager();
    }
    /*
    The function below, controls the entire program. The parameter CHOICE - is the option chosen by the user.
    the ARRAY - hold the options for the computer.The array elements will be referenced by a random generated number
     */
    public static void programManager(/*int choice, String [] array*/){
        //Hannah's code.
//        double randomNuber = Math.random();
//        randomNumber = randomNumber*3;
//        randomNumber = randomNumber+1;
//        int computerOption = (int)randomNumber;

        //the above code could be written this way
        int computerOption = (int)(Math.random()*3);

        String [] theOptions = {"rock", "paper", "scissors"};
        String SystemOption = theOptions[computerOption];

        //Tell the user what to do
        System.out.println("Enter 1 for Rock \n" +
                "Enter 2 for Scissors \n" +
                "Enter 3 for paper");

        int userChoice = input.nextInt();

        switch (userChoice){

            case 1:
                if (SystemOption.equals("rock")){

                    System.out.println("It's a tie. \n" +
                            "running again...");
                    programManager();
                }
                break;
            default:
                System.out.println("Input not valid");
                break;

        }

    }
}
