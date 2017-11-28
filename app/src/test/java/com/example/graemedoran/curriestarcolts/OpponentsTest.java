package com.example.graemedoran.curriestarcolts;

import com.example.graemedoran.curriestarcolts.Opposition.OppModels.Opponents;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 28/11/2017.
 */

public class OpponentsTest {

    @Test
    public void getListTest(){
        Opponents opponents = new Opponents();
        assertEquals(12, opponents.getList());
    }
}
