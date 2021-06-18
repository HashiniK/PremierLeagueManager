package com.Pckage;

import java.util.Date;

public class SchoolFootballClub extends FootballClub {

    private String schoolName;


    public SchoolFootballClub() {
    }


    public SchoolFootballClub(String schoolName) {
        this.schoolName = schoolName;
    }

    public SchoolFootballClub (String schoolName, String name, String location,int noOfWins, int noOfDraws, int noOfDefeats, int noOfPoints, int noOfMatches, int goalsScored, int goalConceded, int goalDifference){
        super(name, location, noOfWins, noOfDraws, noOfDefeats, noOfPoints, noOfMatches, goalsScored, goalConceded, goalDifference);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "SchoolFootballClub{" +
                "schoolName='" + schoolName + '\'' +
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



