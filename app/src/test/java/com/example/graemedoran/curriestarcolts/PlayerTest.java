package com.example.graemedoran.curriestarcolts;

import com.example.graemedoran.curriestarcolts.CurrieStar.Models.Player;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 17/11/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player(13, "Zack Coleman", "Sub");
    }

    @Test
    public void getSquadNumber() {
        assertEquals((Integer) 13, player.getSquadNumber());
    }

    @Test
    public void getNameTest() {
        assertEquals("Zack Coleman", player.getName());
    }

    @Test
    public void getPositionTest() {
        assertEquals("Sub", player.getPosition());
    }
}






