package org.example;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");


        //1. Create the frame.
        JFrame frame = new JFrame("FrameDemo");

//2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setSize(200,200);





//5. Show it.
        frame.setVisible(true);

    }
}