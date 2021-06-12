//Program to find Number of digits in a given number

import java.util.*;

public class NumberOfDigits{
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number to count on");
        long user_input = read.nextLong();
        
        //Just in case if user inputs negative number
        if (user_input < 0 ){
            user_input = user_input * -1;
        }

        int count = 0; 
        
        while (user_input > 0 ){
            long remainder = user_input%10;
            count++;
            user_input  = user_input/10;
        }
        System.out.println("The number of digits in a given number is " + count);
    }
}