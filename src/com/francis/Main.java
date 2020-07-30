package com.francis;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string1;
        String string2;
        Scanner scanner = new Scanner(System.in);
        printOut("Enter the first string\n");
        string1 = scanner.next();
        printOut("Enter the second string\n");
        string2 = scanner.next();
        printOut(String.valueOf(isAnagram(string1,string2)));
    }

    static boolean isAnagram(String string1, String string2){

        if(string1.length() != string2.length())
            return false;

        char[] arr1 = string1.toCharArray();
        char[] arr2 = string2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        for(int i = 0; i< string1.length(); i++)
            if(arr1[i] != arr2[i])
                return false;

        return true;
    }


    static void printOut(String string){
        System.out.print(string);
    }
}
