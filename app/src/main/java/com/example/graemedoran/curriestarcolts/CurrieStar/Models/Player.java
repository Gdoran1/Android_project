package com.example.graemedoran.curriestarcolts.CurrieStar.Models;

/**
 * Created by graemedoran on 16/11/2017.
 */


public class Player {

    private int squadNumber;
    private String name;
    private String position;
    private int id;

    public Player(int id, Integer squadNumber, String name, String position) {
        this.id = id;
        this.squadNumber = squadNumber;
        this.name = name;
        this.position = position;
    }

    public Player(Integer squadNumber, String name, String position){
        this.squadNumber = squadNumber;
        this.name = name;
        this.position = position;
    }

    public Integer getSquadNumber(){
        return squadNumber;}

    public String getName() {
        return name;}

    public String getPosition() {
        return position;}


    public int getId() {
        return id;
    }
}


