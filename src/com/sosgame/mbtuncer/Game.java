package com.sosgame.mbtuncer;

public class Game {
    public static char playersLetter;
    public static char pcLetter;
    public static int playerPoint = 0;
    public static int pcPoint = 0;

    public static void startGame(){
        Character[][] sosTable = PreGame.initializeGameTable();

        System.out.println("Your SOS Table: ");
        Table.printSosTable(sosTable);

        PreGame.decideLetter();
        int whoFirst = PreGame.decideWhoFirst();

        while(true){
            if (whoFirst == 0){
                Player.playerTurn(sosTable);
                if (!(Table.isTableEmpty(sosTable))){
                    System.out.println("Game is end. Final point table: ");
                    showPoints(sosTable);
                    break;
                }
                Pc.pcTurn(sosTable);
            }
            else{
                Pc.pcTurn(sosTable);
                if (!(Table.isTableEmpty(sosTable))){
                    System.out.println("Game is end. Final point table: ");
                    showPoints(sosTable);
                    break;
                }
                Player.playerTurn(sosTable);
            }
            if (!(Table.isTableEmpty(sosTable))){
                System.out.println("Game is end. Final point table: ");
                showPoints(sosTable);
                break;
            }
        }

        System.out.println("======================");

        endGame(playerPoint, pcPoint);
    }

    public static void endGame(int playerPoint, int pcPoint){
        if (playerPoint > pcPoint){
            System.out.println("The winner is PLAYER !!!");
        }
        else if(playerPoint == pcPoint){
            System.out.println("There is no winner. The game is draw.");
        }
        else{
            System.out.println("The winner is PC !!!");
        }
    }

    public static void showPoints(Character[][] sosTable){
        System.out.println("Player point: " + playerPoint);
        System.out.println("Pc point: " + pcPoint);
    }
}
