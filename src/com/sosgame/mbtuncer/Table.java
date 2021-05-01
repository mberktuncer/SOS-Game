package com.sosgame.mbtuncer;

import java.util.Arrays;
import java.util.Scanner;

public class Table {

    public static Character[][] createSosTable(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter the n (nxn) min 3, max 7: ");
            int n = scan.nextInt();
            if (n < 3 || n > 7){
                System.out.println("Please enter a value in valid range !!");
                continue;
            }
            Character[][] sosTable = new Character[n][n];
            for (Character[] characters : sosTable) {
                Arrays.fill(characters, '-');
            }
            return sosTable;
        }
    }

    public static void printSosTable(Character[][] sosTable){
        System.out.print(" ");
        for (int row = 1; row < sosTable.length + 1; row++) {
            System.out.print("  " + row );
        }
        System.out.println();
        for (int row = 0; row < sosTable.length; row++) {
            for (int col = 0; col < sosTable[row].length; col++) {
                if (col < 1) {
                    System.out.print(row + 1);
                }
                System.out.print("  " + sosTable[row][col]);
            }
            System.out.println();
        }
    }

    public static Boolean isTableEmpty(Character[][] sosTable){
        boolean control = false;
        for (Character[] characters : sosTable) {
            for (Character character : characters) {
                if (character == '-') {
                    control = true;
                    break;
                }
            }
        }
        return control;
    }
}
