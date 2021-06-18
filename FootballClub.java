package com.Pckage;

import java.util.Date;
import java.util.Objects;

public class FootballClub extends SportsClub{
    public int noOfWins;
    public int noOfDraws;
    public int noOfDefeats;
    public int noOfPoints;
    public int noOfMatches;
    public int goalsScored;
    public int goalConceded;
    public Date date;

    public int goalDifference = goalConceded - goalsScored;

    public FootballClub(){
    }

    public FootballClub(String name, String location,int noOfWins, int noOfDraws, int noOfDefeats, int noOfPoints, int noOfMatches, int goalsScored, int goalConceded, int goalDifference){
        super(name, location);
        this.noOfWins = noOfWins;
        this.noOfDraws = noOfDraws;
        this.noOfDefeats = noOfDefeats;
        this.noOfPoints = noOfPoints;
        this.noOfMatches = noOfMatches;
        this.goalsScored = goalsScored;
        this.goalConceded = goalConceded;
        this.goalDifference = goalDifference;
    }

    public int getNoOfWins() {
        return noOfWins;
    }

    public void setNoOfWins(int noOfWins) {
        this.noOfWins = noOfWins;
    }

    public int getNoOfDraws() {
        return noOfDraws;
    }

    public void setNoOfDraws(int noOfDraws) {
        this.noOfDraws = noOfDraws;
    }

    public int getNoOfDefeats() {
        return noOfDefeats;
    }

    public void setNoOfDefeats(int noOfDefeats) {
        this.noOfDefeats = noOfDefeats;
    }

    public int getNoOfPoints() {
        return noOfPoints;
    }

    public void setNoOfPoints(int noOfPoints) {
        this.noOfPoints = noOfPoints;
    }

    public int getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(int noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalConceded() {
        return goalConceded;
    }

    public void setGoalConceded(int goalConceded) {
        this.goalConceded = goalConceded;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "name=" + getName() +
                ", location=" + getLocation()+
                ", noOfWins=" + noOfWins +
                ", noOfDraws=" + noOfDraws +
                ", noOfDefeats=" + noOfDefeats +
                ", noOfPoints=" + noOfPoints +
                ", noOfMatches=" + noOfMatches +
                ", goalsScored=" + goalsScored +
                ", goalConceded=" + goalConceded +
                ", goalDifference=" + goalDifference +
                '}';
    }
}
