package com.sosgame.mbtuncer;

public class ControlSosPoint {
    public static String typeOfPoint;

    public static void controlVertical(Character[][] sosTable, int row, int column, String attacker) {
        typeOfPoint = "Vertical";
        if (sosTable[row][column] == 'O') {
            if (row != 0 && row != sosTable.length - 1) {
                if ((sosTable[row + 1][column] == 'S') && (sosTable[row - 1][column] == 'S')) {
                    addPoint(attacker, typeOfPoint);
                }
            }
        }
        else {
            if (row + 2 <= sosTable.length - 1) {
                if ((sosTable[row + 1][column] == 'O') && (sosTable[row + 2][column] == 'S'))
                    addPoint(attacker, typeOfPoint);
            }
            if (row - 2 >= 0) {
                if ((sosTable[row - 1][column] == 'O') && (sosTable[row - 2][column] == 'S'))
                    addPoint(attacker, typeOfPoint);
            }
        }
    }
    
    public static void controlHorizontal (Character[][]sosTable,int row, int column, String attacker){
        typeOfPoint = "Horizontal";
        if (sosTable[row][column] == 'O') {
            if (column != 0 && column != sosTable.length - 1) {
                if ((sosTable[row][column + 1] == 'S') && (sosTable[row][column - 1] == 'S'))
                    addPoint(attacker, typeOfPoint);
            }
        }
        else {
            if (column + 2 <= sosTable.length - 1) {
                if ((sosTable[row][column + 1] == 'O') && (sosTable[row][column + 2] == 'S'))
                    addPoint(attacker, typeOfPoint);;
            }
            if (column - 2 >= 0) {
                if ((sosTable[row][column - 1] == 'O') && (sosTable[row][column - 2] == 'S'))
                    addPoint(attacker, typeOfPoint);
            }
        }
    }

    public static void controlDiagonalLeft(Character[][]sosTable,int row, int column, String attacker){
        typeOfPoint = "Left Diagonal";
        if (sosTable[row][column] == 'O'){
            if (row != 0 && row != sosTable.length - 1 && column != 0 && column != sosTable.length - 1){
                if ((sosTable[row - 1][column - 1] == 'S' && sosTable[row + 1][column + 1] == 'S')){
                    addPoint(attacker, typeOfPoint);
                }
            }
        }
        else{
            //left top diagonal
            if (row - 2 >= 0 && column - 2 >= 0){
                if ((sosTable[row - 1][column - 1] == 'O') && (sosTable[row - 2][column - 2] == 'S')){
                    addPoint(attacker, typeOfPoint);
                }
            }
            //left bottom diagonal
            if (row + 2 <= sosTable.length - 1 && column - 2 >= 0){
                if ((sosTable[row + 1][column - 1] == 'O') && (sosTable[row + 2][column - 2] == 'S')){
                    addPoint(attacker, typeOfPoint);
                }
            }
        }
    }

    public static void controlDiagonalRight(Character[][]sosTable,int row, int column, String attacker){
        typeOfPoint = "Right Diagonal";
        if (sosTable[row][column] == 'O'){
            if (row != 0 && row != sosTable.length - 1 && column != 0 && column != sosTable.length - 1){
                if ((sosTable[row - 1][column + 1] == 'S' && sosTable[row + 1][column - 1] == 'S')){
                    addPoint(attacker, typeOfPoint);
                }
            }
        }
        else{
            //right top diagonal
            if (row - 2 >= 0 && column + 2 <= sosTable.length - 1){
                if ((sosTable[row - 1][column + 1] == 'O') && (sosTable[row - 2][column + 2] == 'S')){
                    addPoint(attacker, typeOfPoint);
                }
            }
            //right bottom diagonal
            if (row + 2 <= sosTable.length - 1 && column + 2 <= sosTable.length - 1){
                if ((sosTable[row + 1][column + 1] == 'O') && (sosTable[row + 2][column + 2] == 'S')){
                    addPoint(attacker, typeOfPoint);
                }
            }
        }
    }

    public static void controlDiagonal(Character[][]sosTable,int row, int column, String attacker){
        controlDiagonalRight(sosTable, row, column, attacker);
        controlDiagonalLeft(sosTable, row, column, attacker);
    }

    public static void addPoint (String attacker, String typeOfPoint){
        if (attacker.equals("Player"))
            Game.playerPoint++;
        else
            Game.pcPoint++;

        System.out.println(attacker + " get the "+ typeOfPoint + " SOS point !");
        System.out.println("======================");
    }
}
