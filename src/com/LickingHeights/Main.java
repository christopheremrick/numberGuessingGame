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




        } while (loop);

    }
}
