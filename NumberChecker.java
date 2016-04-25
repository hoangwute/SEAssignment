package question1;

import java.util.Scanner;

public class NumberChecker {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a positive integer: ");
        int input = sc.nextInt();
        if(input % 2 == 0) {
            System.out.print("This is an even number. ");
        }
        else
            System.out.print("This is an odd number. ");
        if(input == 2 || input == 3 || input == 5)
            System.out.println("This is a prime number.");
        else {
            if(input % 2 != 0 && input % 3 != 0 && input % 5 != 0 && input != 1)
                System.out.print("This is a prime number. ");
            else
                System.out.print("This is not a prime number.");
        }
    }
    
}
