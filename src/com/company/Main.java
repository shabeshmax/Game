package com.company;

import java.io.Console;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Entry Game Screen


            SelectGameInterface gameInterface = new SelectGameInterface();

        String gameFirstScreen = gameInterface.getNEWGAME()+"\n"
                +gameInterface.getOPTIONS()+"\n"
                +gameInterface.getEXIT();

        System.out.println("SELECT:"+"\n");
        System.out.println(gameFirstScreen);

            gameInterface.SelectNEWGAME();
                TimeUnit.SECONDS.sleep(5);

            Story.NEWGAMESETTINGS();








//        if(gameFirstScreen == gameInterface.getNEWGAME()){
//               System.out.println("LOADING NEW GAME...PLEASE WAIT");
//           }
//               if(gameFirstScreen == gameInterface.getOPTIONS()) System.out.println("GRAPHICS SETTINGS" + "\n" +
//                       "AUDIO" + "\n" +
//                       "GO TO BACK");
//        if(gameFirstScreen == gameInterface.getEXIT()){
//            System.out.println("EXITING.....");
//        }


        }







}