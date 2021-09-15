package com.company;

import java.util.Scanner;

public class SelectGameInterface {

    private final String NEWGAME;
    private final String OPTIONS;
    private final String EXIT;

    public SelectGameInterface () {
        this.NEWGAME = "NEWGAME";
        this.OPTIONS = "OPTIONS";
        this.EXIT    = "EXIT";
    }

    public String getNEWGAME () {
        return NEWGAME;
    }

    public String getOPTIONS () {

        return OPTIONS;
    }

    public String getEXIT () {

        return EXIT;
    }


    public void SelectNEWGAME(){
        Scanner input = new Scanner(System.in);



            try {



                String userSelection = input.nextLine();
                if(userSelection .equalsIgnoreCase(NEWGAME)){
                    System.out.println("LOADING NEW GAME...PLEASE WAIT");
                }
                if(userSelection .equalsIgnoreCase(OPTIONS)){
                    System.out.println("GRAPHICS SETTINGS" + "\n" +
                            "AUDIO" + "\n" +
                            "GO TO BACK");
                }
                if(userSelection .equalsIgnoreCase(EXIT)){
                    System.out.println("EXITING.....");
                }
            }
            catch ( Exception e){
                System.out.println("Something went wrong");
            }

    }




}



