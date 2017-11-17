package com.example.graemedoran.curriestarcolts.Models;

import java.util.ArrayList;

/**
 * Created by graemedoran on 17/11/2017.
 */

public class Squad {

    private ArrayList<Player> list;

    public Squad(){
        list = new ArrayList<Player>();
        list.add(new Player(18, "Aidan Fergus-Allen", "Goalkeeper"));
        list.add(new Player(23, "Max Grigor", "Defender"));
        list.add(new Player(22, "Ben Smith", "Defender"));
        list.add(new Player(32, "Callum Boe", "Defender"));
        list.add(new Player(35, "Sam Davies", "Defender"));
        list.add(new Player(24, "Fraser Mundy", "Midfield"));
        list.add(new Player(25, "Craig Doran", "Midfield"));
        list.add(new Player(28, "Jamie Goodbrand", "Midfield"));
        list.add(new Player(29, "Lewis McLean", "Midfield"));
        list.add(new Player(30, "Daniel Mathie", "Midfield"));
        list.add(new Player(21, "Magnus Stewart", "Midfield"));
        list.add(new Player(20, "Henry Reynolds", "Forward"));
        list.add(new Player(27, "Cormac O'Brien", "Forward"));
        list.add(new Player(36, "Sean Clark", "Forward"));



    }

    public ArrayList<Player> getList() {
        return new ArrayList<Player>(list);}
}




