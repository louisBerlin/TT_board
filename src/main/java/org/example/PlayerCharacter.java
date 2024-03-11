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

        if(s.equals("w"))       y = y+1;
        else if(s.equals("s"))  y = y-1;
        else if(s.equals("a"))  x = x+1;
        else if(s.equals("d"))  x = x-1;

    }


}
