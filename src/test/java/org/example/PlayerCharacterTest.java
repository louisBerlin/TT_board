package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {




/*
    @BeforeAll
    static void resetXY() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
    }


 */

    @Test
    void getX_shouldReturn0(){



        //GIVEN
        int expected = 0;
        PlayerCharacter player1 = new PlayerCharacter();



        //WHEN
        int actual =   player1.getX();
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
        PlayerCharacter player2 = new PlayerCharacter();

        //WHEN


        player2.move("w");
        player2.move("w");

        PlayerCharacter.sayHello();


        int actual = player2.getY();

        //THEN
        Assertions.assertEquals(expected,actual);


    }

}