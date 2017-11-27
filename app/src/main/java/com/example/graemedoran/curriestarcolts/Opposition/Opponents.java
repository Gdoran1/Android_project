package com.example.graemedoran.curriestarcolts.Opposition;

import java.util.ArrayList;

/**
 * Created by graemedoran on 27/11/2017.
 */

public class Opponents {

    private ArrayList<Team> list;

    public Opponents(){
        list = new ArrayList<Team>();
        list.add(new Team("Currie FC Colts", "David Newman"));
        list.add(new Team("Duns Juniors", "Paul Matthewson"));
        list.add(new Team("Eniburgh South Cobras", "Danny Boyle"));
        list.add(new Team("Haddington Athletic CFC", "Elaine Fortune"));
        list.add(new Team("Lasswade Thistle Rose", "Derek Black"));
        list.add(new Team("Leith Athletic Colts", "Michael Rafferty"));
        list.add(new Team("Musselburgh Young Stars", "Michelle Renwick"));
        list.add(new Team("Newtongrange Star YDA", "Nicola Glodek"));
        list.add(new Team("Penicuick Athletic YFC", "Brian Stewart"));
        list.add(new Team("Preston Athletic YFC", "Michelle Hardie"));
        list.add(new Team("Redhall Star Colts", "Blair Smith"));
        list.add(new Team("Spartans FC Locomotive", "Keith Chalmers"));



    }

    public ArrayList<Team> getList() {
        return new ArrayList<Team>(list);}


}
