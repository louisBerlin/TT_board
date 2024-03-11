package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {





    @Test
    void getX_shouldReturn0(){

        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        Assertions.assertEquals(expected,actual);


    }


/*
    @Test
    void getY_shouldReturn0(){

        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getY();
        //THEN
        Assertions.assertEquals(expected,actual);


    }


 */
/*
    @Test
    void move_shouldReturn1(){

        //GIVEN
        int expected = 1;
        //WHEN
        int actual = PlayerCharacter.move("w");
        //THEN
        Assertions.assertEquals(expected,actual);


    }

 */

    @Test
    void getY_shouldbe1(){

        //GIVEN
        int expected = 2;
        //WHEN

        PlayerCharacter.move("w");
        PlayerCharacter.move("w");

        int actual = PlayerCharacter.getY();

        //THEN
        Assertions.assertEquals(expected,actual);


    }

}