package com.LickingHeights;

import java.util.Scanner;

class Main {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        greeting();
        String msg;
        System.out.println("Now, type in your message");
        msg = keyboard.nextLine();
        System.out.println(msg + "\n");
        if (msg.contains("*") || msg.contains("-")){
            ToEng(msg);
        }
        else{
            ToMorse(msg);
        }
    }

    private static void greeting() {
        System.out.println("Hello!");
        System.out.println("Welcome to the Morse Code/English Translator!");
    }

    private static void ToMorse(String message) {
        String[] morseCode =
                //A,B,C,D,E,F,G
                {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*",
                        //H,I,J,K,L,M,N,O
                        "****", "**", "*---", "-*-", "*-**", "--", "-*", "---",
                        //P,Q,R,S,T,U,V,W
                        "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--",
                        //X,Y,Z,1,2,3,4
                        "-**-", "-*--", "--**", "*----", "**---", "***--", "****-",
                        //5,6,7,8,9,0
                        "*****", "-****", "--***", "---**", "----*", "-----"};
        String[] chars = {"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z", "1", "2", "3", "4",
                "5", "6", "7", "8", "9", "0"};
        String[] caps = {"A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W",
                "X", "Y", "Z"};

        for (int a = 0; a <=0; a++) {
             message = message.replace(chars[a], morseCode[a]);

        }
        for (int b = 0; b <=0; b++) {
             message = message.replace(caps[b], morseCode[b]);

        }
        System.out.println(message);
    }
        private static void ToEng(String Message){
            String[] mCode =
                    //A,B,C,D,E,F,G
                    {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*",
                            //H,I,J,K,L,M,N,O
                            "****", "**", "*---", "-*-", "*-**", "--", "-*", "---",
                            //P,Q,R,S,T,U,V,W
                            "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--",
                            //X,Y,Z,1,2,3,4
                            "-**-", "-*--", "--**", "*----", "**---", "***--", "****-",
                            //5,6,7,8,9,0
                            "*****", "-****", "--***", "---**", "----*", "-----"};
            String[] english =
                    {"A", "B", "C", "D", "E", "F", "G",
                            "H", "I", "J", "K", "L", "M", "N", "O",
                            "P", "Q", "R", "S", "T", "U", "V", "W",
                            "X", "Y", "Z", "1", "2", "3", "4",
                            "5", "6", "7", "8", "9", "0"
                    };
            for (int c=0; c<=0; c++){
                Message = Message.replace(mCode[c], english[c]); {
                }
            }
            System.out.println(Message);

            }
    }




