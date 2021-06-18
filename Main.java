package com.Pckage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //loop state variable
        boolean loopState = true;

        //creating an object for PremierLeagueManager class
        PremierLeagueManager premierLeagueManager = new PremierLeagueManager();
        Scanner scanner = new Scanner (System.in);
        System.out.println("\n ----- Premier League Championship -----");

        //looping to get the inputs
        do{
            System.out.println("\n ----- Select the option from the menu -----");
            System.out.println("\n A - Add a New Club \n D - Delete a Club \n V - Display the Premier League Table \n S - Save Details to a file \n G - Add a New Game \n C - Display Stats of a Selected Club");
            System.out.print("\n Enter Your Option - ");

            String option = scanner.nextLine().toLowerCase();

            switch (option){
                case "a" : premierLeagueManager.add(option);
                    break;
                case "d" : premierLeagueManager.delete();
                    break;
                case "v" : premierLeagueManager.displayStat();
                    break;
                case "s" : premierLeagueManager.save();
                    break;
                case "g" : premierLeagueManager.addGame();
                    break;
                case "c" : premierLeagueManager.displaySelectedClub();
                    break;
                case "q" :premierLeagueManager.quit();
                    break;
                default :
                    System.out.println("\n Value You Have Entered is INCORRECT!");
            }
        } while (loopState);
    }
}
