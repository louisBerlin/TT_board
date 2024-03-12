package org.example;

public class PlayerCharacter {


    private int x = 0;
    private int y = 0;


    public PlayerCharacter(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public PlayerCharacter(int x) {
        this.x = x;
        this.y = 10;
    }



    public PlayerCharacter() {
        this.x = 0;
        this.y = 0;
    }

    public  int getX(){
        return x;
    }

    public  int getY(){
        return y;
    }


    public  void move(String s) {

        System.out.println("commit 2");

        switch (s) {
            case "w" -> y = y + 1;
            case "s" -> y = y - 1;
            case "a" -> x = x + 1;
            case "d" -> x = x - 1;
        }

    }



    static public void sayHello(){

        System.out.println("Hello");



    }

}


 class Tool {

     static public int puissance(int b){
         return b*b;
     }
     static public void tool2(){}
     static public void tool3(){}
     static public void tool4(){}
     static public void tool5(){}


 }



 class User {

    String userName;
    int age;
    String password;


     public User(String userName, int age, String password) {
         this.userName = userName;
         this.age = age;
         this.password = password;
     }


     public User(String userName) {
         this.userName = userName;
         this.age = 18;
         this.password = "1234";
     }



     public String getUserName() {
         return userName;
     }

     public void setUserName(String userName) {
         this.userName = userName;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }
 }