package com.LickingHeights;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static boolean translate = true;
    public static void main(String[] args) {
    String message;
    int index = 0;
    greeting();
    }
    public static final String [] morsecode =
            //A,B,C,D,E,F,G
            {"*-","-***","-*-*","-**","*","**-*","--*",
                    //H,I,J,K,L,M,N,O
                    "****","**","*---","-*-","*-**","--","-*","---",
                    //P,Q,R,S,T,U,V,W
                    "*--*","--*-","*-*","***","-","**-","***-","*--",
                    //X,Y,Z,1,2,3,4
                    "-**-","-*--","--**","*----","**---","***--","****-",
                    //5,6,7,8,9,0
                    "*****","-****","--***","---**","----*","-----"

            };
    public static final String[] alphabet =
            {"A","B","C","D","E","F","G",
                    "H","I","J","K","L","M","N","O",
                    "P","Q","R","S","T","U","V","W",
                    "X","Y","Z","1","2","3","4",
                    "5","6","7","8","9","0"
            };
    public static void greeting(){
        System.out.println("Hello!");
        System.out.println("Welcome to the Morse Code/English Translator!");
    }
    public static  
}
