package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
                    System.out.println("""
                            -------------------(This Game adapts to the choices you make)----------------


                            """);


                        TimeUnit.SECONDS.sleep(6);



                                LinkedList<String> cutscenes = new LinkedList<>();





                                    cutscenes.add("The 20 th century is the century where technologies began to develop efficiently");
                                    TimeUnit.SECONDS.sleep(3);




                                             cutscenes.add("In the Year 2065, Time Travel had been invented by the mankind. In earlier 20th Century, Many thought Time Travel was impossible ,due to the theory of relativity by Albert Einstein ");
                                                    cutscenes.add("\n"+"After decades , a group of scientists organization named the Void discovered unknown dark energy from the end of the earth antartica.Using dark energy they started making weaponized matherials," +
                                                                    "and later they invented a teleportation gear,using dark energy");
                                                cutscenes.add("\n"+"And the organization controlled everything within a nation to achieve their goals.They tested humans as their test subjects,and gave update to the gears,dark energy adapts to the nature of human beings within the atomic particles,uniquely gives them power to teleport,time travel etc.");





                                                        System.out.println(cutscenes);
                                                        System.out.println("\t"+"..........ENTERING VOID.........");















//                                String ques = "Hey! are you alright,Heller?";
//
//                                        String a = "No,not sure";
//                                        String b = "Yeah";
//                                        String c = "Where am I? Who are you";
//
//                                        String ans = input.nextLine();
//                                        System.out.println("Make your choice:");
//
//                                        if(ans==a){
//                                            System.out.println(a);
//                                        }
//                                        if(ans==b){
//                                            System.out.println(b);
//                                        }
//                                        if(ans==a){
//                                            System.out.println(c);
//                                        }



















//
//
//                                    String chc;
//                                    String sum ="";
//
//                                    for (int i=0;i<=choices.size();i++){
//                                        chc=input.nextLine();
//                                        sum+=chc;
//                                        System.out.println(choices.get(i));
//
//                                        if(choices.equals(1)){
//                                            System.out.println(1);
//                                        }
//                                        if(choices.equals(2)){
//                                            System.out.println(2);
//                                        }
//                                        if(choices.equals(3)){
//                                            System.out.println(3);
//                                        }
//
//                                    }
































                }



                if(userSelection .equalsIgnoreCase(OPTIONS)){
                    System.out.println("""
                            GRAPHICS SETTINGS
                            AUDIO
                            GO TO BACK""");
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



