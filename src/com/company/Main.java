package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int badGuess = 50;
        System.out.println("Enter your secret number");
        int aNumber = 0;
        Scanner keyboard = new Scanner(System.in);
        aNumber = keyboard.nextInt();


        String low = "lower";
        String high = "higher";
        String correct = "yes";


        while (true) {


            System.out.println("My guess is " + badGuess + ". Is my guess higher or lower than your number?");

            String highOrLow = "";

            highOrLow = keyboard.next();

            if (highOrLow.equals(correct)){
                System.out.println("I guessed your number!");
                System.exit(0);}

            if (highOrLow.equals(low)) {

                int previousGuess = badGuess;
                System.out.println("Ok, I will guess a lower number.");


                badGuess = (int) (Math.random() * 100 + 1);

                if (badGuess >= previousGuess){
                    while(badGuess >= previousGuess){
                        badGuess = (int) (Math.random() * 100 + 1);
                    }
                }

                if (highOrLow.equals(correct)){
                    System.out.println("I guessed your number!");
                    System.exit(0);
                }


            } else if (highOrLow.equals(high)) {

                int previousGuess = badGuess;
                System.out.println("Ok, I will guess a higher number.");


                badGuess = (int) (Math.random() * 100 + 1);

                if (badGuess <= previousGuess){
                    while(badGuess <= previousGuess){
                        badGuess = (int) (Math.random() * 100 + 1);
                    }
                }

                if (highOrLow.equals(correct)){
                    System.out.println("I guessed your number!");
                    System.exit(0);
                }


            } else {
                System.out.println("Sorry, I do not know what you mean.");
            }

        }
    }}