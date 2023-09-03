package com.teachmeskills.lesson11.part1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *The class implements a method for adding numbers to the list from the console, which outputs only even numbers
 */
public class Collections {

    public static void fillingTheCollection(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //filling the list with numbers from the console
        System.out.println("Enter the number to add to the collection:");
        while (true){
            String scannerInput = scanner.next();
            if (scannerInput.equals("exit")){
                break;
            }
            try {
                int number_conversion = Integer.parseInt(scannerInput);
                arrayList.add(number_conversion);
                System.out.println("enter a number or 'exit' to exit");
            }catch (NumberFormatException e){
                System.out.println("You have entered a string, only integers are allowed before entering");
            }
        }
        //output of all even numbers
        System.out.println("List of even numbers of the collection:");
        for (int num : arrayList){
            if (num % 2 == 0){
                System.out.print(num + " ");
            }

        }
    }

}
