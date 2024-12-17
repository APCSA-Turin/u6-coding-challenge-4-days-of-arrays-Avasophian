
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        int randomNum;
        String[][] listToReturn = new String[2][names.length];
        for (int i = 0; i< names.length; i++)
        {
            randomNum = ((int)(Math.random() * 2) + 1) - 1;
            listToReturn[randomNum][i] = names[i];
        }
        return listToReturn;
    }

    public static void main(String[] args) {

    }
}