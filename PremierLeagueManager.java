package com.Pckage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PremierLeagueManager implements LeagueManager{

    private String name;
    private String location;
    private String schoolName;
    private String uniName;
    private int noOfWins;
    private int noOfDraws;
    private int noOfDefeats;
    private int noOfPoints;
    private int noOfMatches;
    private int goalsScored;
    private int goalConceded;
    private Date date;
    private int goalDifference;

    private List<FootballClub> allClubs = new ArrayList<>();
    private ArrayList<FootballClub> clubs = new ArrayList<>();
    private static LeagueManager premierLeagueManager = new PremierLeagueManager();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add(String option){
        SportsClub sportsClub = new SportsClub();

        System.out.println("\n ----- ADDING A NEW CLUB -----");
        System.out.println("\n ----- Select an Option -----");
        System.out.println("\n D - Default Football Club \n U - University Football Club \n S - School Football Club");

        System.out.print("\n Please Enter Your Option - ");
        option = scanner.nextLine().toLowerCase();

        switch (option) {
            case "d":

                System.out.print("\n Please Enter the Club Name - ");
                name = scanner.nextLine();

                System.out.print(" Please Enter the Location - ");
                location = scanner.nextLine();

                System.out.print(" Enter the number of wins - ");
                noOfWins = scanner.nextInt();

                System.out.print(" Enter the number of defeats - ");
                noOfDefeats = scanner.nextInt();

                System.out.print(" Enter the number of draws - ");
                noOfDraws = scanner.nextInt();

                System.out.print(" Enter the number of points - ");
                noOfPoints = scanner.nextInt();

                System.out.print(" Enter the number of matches - ");
                noOfMatches = scanner.nextInt();

                System.out.print(" Enter the number of goals scored - ");
                goalsScored = scanner.nextInt();

                System.out.print(" Enter the number of goals conceded - ");
                goalConceded = scanner.nextInt();

                goalDifference = goalsScored - goalConceded;

                FootballClub footballClub = new FootballClub(name, location,noOfWins,noOfDraws,noOfDefeats,noOfPoints,noOfMatches,goalsScored,goalConceded,goalDifference);
                allClubs.add(footballClub);

                break;

            case "u":


                System.out.print("\n Please Enter the Club Name - ");
                name = scanner.nextLine();

                System.out.print(" Please Enter the Location - ");
                location = scanner.nextLine();

                System.out.print(" Please Enter the University Name - ");
                uniName = scanner.nextLine();

                System.out.print(" Enter the number of wins - ");
                noOfWins = scanner.nextInt();

                System.out.print(" Enter the number of defeats - ");
                noOfDefeats = scanner.nextInt();

                System.out.print(" Enter the number of draws - ");
                noOfDraws = scanner.nextInt();

                System.out.print(" Enter the number of points - ");
                noOfPoints = scanner.nextInt();

                System.out.print(" Enter the number of matches - ");
                noOfMatches = scanner.nextInt();

                System.out.print(" Enter the number of goals scored - ");
                goalsScored = scanner.nextInt();

                System.out.print(" Enter the number of goals conceded - ");
                goalConceded = scanner.nextInt();

                goalDifference = goalsScored - goalConceded;

                UniversityFootballClub universityFootballClub = new UniversityFootballClub(uniName,name,location,noOfWins,noOfDraws,noOfDefeats,noOfPoints,noOfMatches,goalsScored,goalConceded,goalDifference);
                allClubs.add(universityFootballClub);
                break;

            case "s":

                System.out.print(" Please Enter the Club Name - ");
                name = scanner.nextLine();

                System.out.print(" Please Enter the Location - ");
                location = scanner.nextLine();

                System.out.print(" Please Enter the School Name - ");
                schoolName = scanner.nextLine();

                System.out.print(" Enter the number of wins - ");
                noOfWins = scanner.nextInt();

                System.out.print(" Enter the number of defeats - ");
                noOfDefeats = scanner.nextInt();

                System.out.print(" Enter the number of draws - ");
                noOfDraws = scanner.nextInt();

                System.out.print(" Enter the number of points - ");
                noOfPoints = scanner.nextInt();

                System.out.print(" Enter the number of matches - ");
                noOfMatches = scanner.nextInt();

                System.out.print(" Enter the number of goals scored - ");
                goalsScored = scanner.nextInt();

                System.out.print(" Enter the number of goals conceded - ");
                goalConceded = scanner.nextInt();

                goalDifference = goalsScored - goalConceded;

                SchoolFootballClub schoolFootballClub = new SchoolFootballClub(schoolName,name,location,noOfWins,noOfDraws,noOfDefeats,noOfPoints,noOfMatches,goalsScored,goalConceded,goalDifference);
                allClubs.add(schoolFootballClub);

                break;

            default:
                System.out.println("\n Invalid Option!");
        }
    }

    @Override
    public void delete() {
        System.out.print("Please enter the club name - ");
        String clubName = scanner.nextLine();

        boolean clubEmpty = false;
        if (allClubs.isEmpty()){
            System.out.println("There are no added clubs!");
        }
        for (FootballClub footballClub : allClubs){
            if (footballClub.getName().equals(clubName)){
                clubEmpty = true;
                clubs.remove(footballClub);
                System.out.println("Club has been deleted successfully!");
            } else {
                System.out.println("Please enter a valid club name!");
            }
        }

    }

    @Override
    public void displayStat() {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("%-25s %-15s %15s %15s %15s %n", "Club Name", " Points", "GD", "Wins", "Loses");
        System.out.println("----------------------------------------------------------------------------------------------");
        for (FootballClub footballClub : allClubs){
            System.out.printf("%-25s %-15s %15s %15s %15s %n",footballClub.getName(), footballClub.getLocation(), footballClub.getGoalDifference(), footballClub.getNoOfWins(), footballClub.getNoOfDefeats());
        }

    }

    @Override
    public void save() {
        System.out.println(allClubs);

    }

    @Override
    public void addGame() {

    }

    @Override
    public void displaySelectedClub() {

    }

    @Override
    public void quit(){
        System.exit(0);
        System.out.println("You have quited the program");
    }
}
