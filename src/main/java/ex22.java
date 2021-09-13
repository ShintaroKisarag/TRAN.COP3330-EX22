/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class ex22 {
    public static boolean storage(int[] numbers, int x){    //checks if the number has been used or not
        for(int n: numbers)
            if(n == x)
                return true;
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[25];
        int count = 0;
        int largest = 0;
        while(count<10){    // enters up to 10 numbers
            System.out.print("Enter any number ");
            int x = input.nextInt();
            if(storage(numbers,x)) {    //checks if the numbers entered are the same
                System.out.print("Number has already been entered. Pick a different number");
                continue;
            }
            numbers[count++] = x;
            largest = Math.max(x,largest);  //finds the largest number
            System.out.println("The largest number is "+largest);
        }
    }
}

