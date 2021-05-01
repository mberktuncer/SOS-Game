package com.sosgame.mbtuncer;

import java.util.Scanner;

public class Player {
    public static void playerTurn(Character[][] sosTable){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Enter the line number you want to mark: ");
            int line = scan.nextInt() - 1;
            System.out.print("Enter the column number you want to mark: ");
            int column = scan.nextInt() - 1;
            System.out.println("======================");

            if ((line < 0 || column < 0) || (line >= sosTable.length || column >= sosTable.length)){
                System.out.println("Incorrect raw or column entry ! Please enter the line and column again.");
                continue;
            }
            if (sosTable[line][column] != '-'){
                System.out.println("The area you selected is not empty. Please enter the new line and column.");
                continue;
            }
            sosTable[line][column] = Game.playersLetter;

            System.out.println("Current status of the table: ");
            Table.printSosTable(sosTable);
            System.out.println("======================");

            ControlSosPoint.controlHorizontal(sosTable,line,column, "Player");
            ControlSosPoint.controlVertical(sosTable,line,column,"Player");
            ControlSosPoint.controlDiagonal(sosTable,line,column,"Player");


            System.out.println("Live points statements: ");
            Game.showPoints(sosTable);
            System.out.println("======================");

            break;
        }
    }
}
