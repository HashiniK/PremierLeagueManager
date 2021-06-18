package com.Pckage;

public interface LeagueManager {
    public void add(String option);                 // Add a new club
    public void delete();               // Delete a club
    public void displayStat();          // Display the Premier League Table
    public void save();                 // Save details to a file
    public void addGame();              // Add a newly played game
    public void displaySelectedClub();  // Display statics of a selected club
    public void quit();
}
