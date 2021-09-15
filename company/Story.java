package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Story extends SelectGameInterface {


    public static void NEWGAMESETTINGS () throws InterruptedException {

        System.out.println("-------------------(This Game adapts to the choices you make)----------------"+"\n"+"\n"+"\n");
        TimeUnit.SECONDS.sleep(6);
        LinkedList<String> cutscenes = new LinkedList<>();
        cutscenes.add("The 20 th century is the century where technologies began to develop efficiently");
        TimeUnit.SECONDS.sleep(3);
        cutscenes.add("In the Year 2065, Time Travel had been invented by the mankind. In earlier 20th Century, Many thought Time Travel was impossible ,due to the theory of relativity by Albert Einstein ");
        cutscenes.add("After decades , a group of scientists organization named the Void discovered unknown dark energy from the end of the earth antartica.Using dark energy they started making weaponized matherials," +
                "and later they invented a telepotation gear,using dark energy");
        System.out.println(cutscenes);



    }

    public static void makeChoices() throws InterruptedException {
        //makechoice using hashmap
        //make like a,b,c and let player make the choice
        //like a loop between a,b,c according to the choices
        //connecting a,b,c to the next by nodes







    }



}
