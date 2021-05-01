package com.sosgame.mbtuncer;

import java.util.Random;

public class Pc {
    public static void pcTurn(Character[][] sosTable) {
        Random rnd = new Random();
        System.out.println("Pc's turn...");
        System.out.println("Pc made decision..");
        while (true) {
            int pcLine = rnd.nextInt(sosTable.length);
            int pcColumn = rnd.nextInt(sosTable.length);

            if (sosTable[pcLine][pcColumn] != '-') {
                continue;
            }
            sosTable[pcLine][pcColumn] = Game.pcLetter;

            System.out.println("Current status of the table: ");
            Table.printSosTable(sosTable);
            System.out.println("======================");

            ControlSosPoint.controlHorizontal(sosTable,pcLine,pcColumn, "Pc");
            ControlSosPoint.controlVertical(sosTable,pcLine,pcColumn,"Pc");
            ControlSosPoint.controlDiagonal(sosTable,pcLine,pcColumn,"Pc");

            System.out.println("Live points statements: ");
            Game.showPoints(sosTable);
            System.out.println("======================");

            break;
        }
    }
}
