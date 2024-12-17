package com.example.project;
import java.util.Random;
import java.util.Scanner; 
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name)
    {
        // Scanner scan = new Scanner(System.in); 
        // System.out.println("Enter your name: ");
        // String userName = scan.nextLine();''
        if (name.equals("") || name.equals(null))
        {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        int randomNum = ((int)(Math.random() * 5) + 1) - 1;
        return elf_names[randomNum] + " " +  name;  
    }
}