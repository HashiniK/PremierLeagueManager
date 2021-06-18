package com.Pckage;

import java.util.Date;
import java.util.Objects;

public class UniversityFootballClub extends FootballClub{

    private String uniName;


    public UniversityFootballClub(){
    }

    public UniversityFootballClub(String uniName){
        this.uniName = uniName;
    }

    public UniversityFootballClub (String uniName, String name, String location,int noOfWins, int noOfDraws, int noOfDefeats, int noOfPoints, int noOfMatches, int goalsScored, int goalConceded, int goalDifference){
        super(name, location, noOfWins, noOfDraws, noOfDefeats, noOfPoints, noOfMatches, goalsScored, goalConceded, goalDifference);
        this.uniName = uniName;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    @Override
    public String toString() {
        return "UniversityFootballClub{" +
                "uniName='" + uniName + '\'' +
                ", name='" + getName() +
                ", location= '" + getLocation() +
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
