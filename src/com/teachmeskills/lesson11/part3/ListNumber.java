package com.teachmeskills.lesson11.part3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Implemented a method of adding random numbers to the list by the length of the number entered from the console,
 *      and output the arithmetic mean of the numbers in this list
 */
public class ListNumber {

    public static void outputArithmeticMean() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        //filling the list with random numbers
        System.out.print("Enter a number to create the length of the list: ");
        try {
            int scannerInput = scanner.nextInt();
            if (scannerInput < 0){
                throw new IllegalArgumentException("The length of the list cannot be negative, repeat again!");
            }
            for (int i = 0; i < scannerInput; i++) {
                int randomNum = random.nextInt(10);
                arrayList.add(randomNum);
            }
        } catch (InputMismatchException e) {
            System.out.println("An integer is required to enter, repeat again!");
            outputArithmeticMean();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            outputArithmeticMean();
        }

        //List output
        System.out.print("list of numbers: ");
        for (int num : arrayList){
             System.out.print(num + " ");
        }
        System.out.println();

        //finding the arithmetic mean
        int sum_list = 0;
        for (int num : arrayList) {
            sum_list += num;
        }
        System.out.println("Arithmetic mean of the list: " + sum_list / arrayList.size());
    }
}
