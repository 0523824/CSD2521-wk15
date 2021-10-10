/*
Name: Winston Zheng
Date: October 9, 2021
Purpose: This application will parse full names into first and 
last name or first, middle, and last name.
*/

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        name = name.trim();
        
        String[] nameArr = name.split(" ");
        if (nameArr.length == 2) {
            System.out.println("First name: " + nameArr[0]);
            System.out.println("Last name: " + nameArr[1]);
        } else if (nameArr.length == 3) {
            System.out.println("First name: " + nameArr[0]);
            System.out.println("Middle name: " + nameArr[1]);
            System.out.println("Last name: " + nameArr[2]);
        } else {
            System.out.println("Error! Name must be two or three words.");
        }
         
    }
}
