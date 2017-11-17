package com.example.graemedoran.curriestarcolts;

import com.example.graemedoran.curriestarcolts.Models.Squad;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by graemedoran on 17/11/2017.
 */

public class SquadTest {

    @Test
    public void getListTest(){
        Squad squad = new Squad();
        assertEquals(14, squad.getList());
    }
}



