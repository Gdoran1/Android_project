package com.example.graemedoran.curriestarcolts.CurrieStar.Models;

import java.io.Serializable;

/**
 * Created by graemedoran on 16/11/2017.
 */


public class Player implements Serializable{

    private int squadNumber;
    private String name;
    private String position;
    private int id;
    private String contact;
    private String address;
    private String e_Mail;
    private String tel;

    public Player(Integer id, Integer squadNumber, String name, String position, String contact, String address, String email, String tel) {
        this.id = id;
        this.squadNumber = squadNumber;
        this.name = name;
        this.position = position;
        this.address = address;
        this.contact = contact;
        this.e_Mail = email;
        this.tel = tel;
    }

    public Player(Integer squadNumber, String name, String position){
        this.squadNumber = squadNumber;
        this.name = name;
        this.position = position;
    }

    public Integer getSquadNumber(){return squadNumber;}

    public String getName() {return name;}

    public String getPosition() {return position;}

    public Integer getId() {return id;}

    public String getContact(){return contact;}

    public String getAddress(){return address;}

    public  String getE_Mail(){return e_Mail;}

    public String getTel(){return tel;}
}


