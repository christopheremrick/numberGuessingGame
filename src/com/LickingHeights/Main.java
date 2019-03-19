package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Using do while statement to loop until boolean is set to true

        Integer number = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);

        Boolean loop = true;
        do {
            System.out.println("Please guess a number between one and one hundred.");
            Integer numberGuessed = scan.nextInt(); // When looped back it should take user input again

            if(numberGuessed > number) {
                System.out.println("The number you guessed is too large! Try again.");
            }
            else if(numberGuessed < number) {
                System.out.println("The number you guessed is too small! Try again.");
            }
            else if(numberGuessed == number) {
                loop = false;
            }
            else {
                System.out.println("That isn't what I asked for. Try again.");
            }

        } while (loop);

        System.out.println("You guessed the correct number!");
        System.out.println("The number was " + number + ".");

    }
}
