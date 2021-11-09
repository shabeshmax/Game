package com.company;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Story extends SelectGameInterface {


    public static void NEWGAMESETTINGS () throws InterruptedException {

//        System.out.println("-------------------(This Game adapts to the choices you make)----------------"+"\n"+"\n"+"\n");
//        TimeUnit.SECONDS.sleep(6);
//        LinkedList<String> cutscenes = new LinkedList<>();
//        cutscenes.add("The 20 th century is the century where technologies began to develop efficiently");
//        TimeUnit.SECONDS.sleep(3);
//        cutscenes.add("In the Year 2065, Time Travel had been invented by the mankind. In earlier 20th Century, Many thought Time Travel was impossible ,due to the theory of relativity by Albert Einstein ");
//        cutscenes.add("After decades , a group of scientists organization named the Void discovered unknown dark energy from the end of the earth antartica.Using dark energy they started making weaponized matherials," +
//                "and later they invented a telepotation gear,using dark energy");
//        System.out.println(cutscenes);



    }

    public static void makeChoices() throws InterruptedException {
        Scanner input = new Scanner(System.in);
                //makechoice using hashmap
                //make like a,b,c and let player make the choice
                //like a loop between a,b,c according to the choices
                //connecting a,b,c to the next by nodes
                String ques = "Steve : Hey! are you alright,Heller?";

                        String a = "No,not sure";
                        String b = "Yeah";
                        String c = "Where am I? Who are you";

                        System.out.println("Make your choice:");
                        System.out.println("*"+" "+ques+"\n"+a+"\n"+b+"\n"+c+"\n");
                        String ans = input.nextLine();


                            if(ans.equalsIgnoreCase(a)){

                                System.out.println(a);
                            }



                            if(ans.equalsIgnoreCase(b)){

                                System.out.println(b);
                            }


                            if(ans.equalsIgnoreCase(c)){

                                System.out.println(c);
                            }





    }
    public  static void actions() {



        Scanner input = new Scanner(System.in);

        String ques = "Steve : Here, take my hand";


            String a = "Take Hand";
            String b = "Refuse Hand";
            String c= "Get up yourself";

            System.out.println("Make action:");
            System.out.println("*"+" "+ques+"\n"+a+"\n"+b+"\n"+c+"\n");

        String ans1 = input.nextLine();

            if(ans1.equalsIgnoreCase(a)){

                 System.out.println(a);

                        System.out.println("Steve : Do you need water or something");
            }



                if(ans1.equalsIgnoreCase(b)){

                    System.out.println(b);

                            System.out.println("Steve : Being a tough guy? huh?");
                }




                if(ans1.equalsIgnoreCase(c)){

                        System.out.println(c);

                            System.out.println("Steve : What happened,Are u okay?");
                }





                        String fans = ans1;

                        if (fans.equalsIgnoreCase("take hand")) {

                            if (b.equalsIgnoreCase("refuse hand")) {


                                System.out.println("Being a tough guy");

                            }

                        }
                        else {
                            System.out.println(" ");
                        }






    }



}
