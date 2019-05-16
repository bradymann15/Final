package com.LickingHeights;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static boolean translate = true;
    public static void main(String[] args) {
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
    public static String translate(Scanner keyboard){
        System.out.println("Type 'morse' to do Morse Code to English");
        System.out.println("Type 'english' to do English to Morse Code");
        String message = keyboard.nextLine().toLowerCase();
        int i, j = 0;
        if (message == "english"){
            message = english[i]
        }
        char[] chars = message.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j)
        }
    }
}
