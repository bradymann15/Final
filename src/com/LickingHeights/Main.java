package com.LickingHeights;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static boolean translate = true;
    public static void main(String[] args) {
    greeting();
    }

    public static void greeting(){
        System.out.println("Hello!");
        System.out.println("Welcome to the Morse Code/English Translator!");
    }
    public static String translate(Scanner keyboard){
        String [] morsecode =
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
        String[] english =
                {"A","B","C","D","E","F","G",
                        "H","I","J","K","L","M","N","O",
                        "P","Q","R","S","T","U","V","W",
                        "X","Y","Z","1","2","3","4",
                        "5","6","7","8","9","0"
                };
        System.out.println("Type 'morse' to do Morse Code to English");
        System.out.println("Type 'english' to do English to Morse Code");
        String message = keyboard.nextLine().toLowerCase();
        String result;
        int i, j = 0;
        if (message == "english"){
            message = english[i];
            result = morsecode[i];
        }
        else if (message == "morse"){
            message = morsecode[i];
            result = english[i];
        }
        char[] chars = message.toCharArray();
        for (i = 0; i < chars.length; i++){
            for (j = 0; j < chars.length; j++){
            }

        }
    }
}
