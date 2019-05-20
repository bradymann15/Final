package com.LickingHeights;

import java.util.Scanner;

class Main {
    private static final Scanner keyboard = new Scanner(System.in);
    static boolean translate = true;
    public static void main(String[] args) {
    greeting();
    translate(keyboard);
    }

    private static void greeting(){
        System.out.println("Hello!");
        System.out.println("Welcome to the Morse Code/English Translator!");
    }
    public static void translate(Scanner keyboard){
        String [] morseCode =
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
        String result = "21";
        int I, J = 0;
        if (message == "english"){
            message = english[J];
            result = morseCode[J];
        }
        else if (message == "morse"){
            message = morseCode[J];
            result = english[J];
        }
        char[] chars = message.toCharArray();
        for (I = 0; I < chars.length; I++){
            for (J = 0; J < chars.length; J++){
                if (message == "english"){
                    message = message.replace(english[I], morseCode[I]);
                }
                    else if (message == "morse"){
                    message = message.replace(morseCode[I], english[I]);
                }
                }
            }
            System.out.println(message);
        }

    }

