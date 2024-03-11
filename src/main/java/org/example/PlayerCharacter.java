package org.example;

public class PlayerCharacter {


    static int x = 0;
    static int y = 0;

    public static int getX(){
        return x;
    }


    public static int getY(){
        return y;
    }


    public static void move(String s) {

        System.out.println("commit 2");

        switch (s) {
            case "w" -> y = y + 1;
            case "s" -> y = y - 1;
            case "a" -> x = x + 1;
            case "d" -> x = x - 1;
        }

    }


}
