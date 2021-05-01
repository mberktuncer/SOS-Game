package com.sosgame.mbtuncer;

import java.util.Random;

public class PreGame {

    public static Character[][] initializeGameTable(){
        return Table.createSosTable();
    }

    public static void decideLetter(){
        Random rnd = new Random();

        int playersLetterRandom = rnd.nextInt(2);

        if (playersLetterRandom == 0) {
            Game.playersLetter = 'S';
            Game.pcLetter = 'O';
        }
        else{
            Game.playersLetter = 'O';
            Game.pcLetter = 'S';
        }
        System.out.println("Your letter: " + Game.playersLetter + " Pc letter: " + Game.pcLetter);
        System.out.println("======================");
    }

    public static int decideWhoFirst(){
        Random rnd = new Random();
        return rnd.nextInt(2);
    }
}
