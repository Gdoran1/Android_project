package com.example.graemedoran.curriestarcolts.Opposition.OppModels;

import java.io.Serializable;

/**
 * Created by graemedoran on 27/11/2017.
 */

public class Team implements Serializable{

    private int id;
    private String team_name;
    private String contact;
    private String e_Mail;
    private String tel;
    private String location;

    public Team(Integer id, String team_name, String contact, String location, String email, String tel) {
        this.id = id;
        this.team_name = team_name;
        this.contact = contact;
        this.e_Mail = email;
        this.tel = tel;
        this.location = location;
    }


    public Team(String team_name, String contact) {
        this.team_name = team_name;
        this.contact = contact;
    }

    public Integer getId() {return id;}

    public String getName() {return team_name;}

    public String getContact(){return contact;}

    public  String getE_Mail(){return e_Mail;}

    public String getTel(){return tel;}

    public String getLocation(){return location;}
}