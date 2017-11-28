package com.example.graemedoran.curriestarcolts;

import com.example.graemedoran.curriestarcolts.Opposition.OppModels.Team;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 28/11/2017.
 */

public class TeamTest {

    Team team;

    @Before
    public void before() {
        team = new Team("currie star", "graeme doran");
    }


    @Test
    public void getNameTest() {
        assertEquals("currie star", team.getName());
    }

    @Test
    public void getContactTest() {
        assertEquals("graeme doran", team.getContact());
    }
}