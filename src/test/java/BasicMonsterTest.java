/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daryl
 */
public class BasicMonsterTest {

    BasicMonster baseMon;

    public BasicMonsterTest() {
        baseMon = new BasicMonster();
        assertEquals(1.0, baseMon.getTypeBonus(), 0.1);
    }

    @Test
    public void testGetAtt() {
        Assert.assertNotNull(baseMon.getAtt());
    }

    @Test
    public void testSetNewStats() {
        int attPoint = baseMon.getAtt();
        baseMon.setNewStats();
        Assert.assertNotEquals(attPoint, baseMon.getAtt());
    }

    @Test
    public void testGetDef() {
        Assert.assertNotNull(baseMon.getDef());
    }

    @Test
    public void testGetHealth() {
        Assert.assertNotNull(baseMon.getHealth());
    }

    @Test
    public void testGetLevel() {
        Assert.assertNotNull(baseMon.getLevel());
    }

    @Test
    public void testSetLevel() {
        int orgLevel = baseMon.getLevel();
        baseMon.setLevel(10);
        Assert.assertNotEquals(orgLevel, baseMon.getLevel());
    }

    @Test
    public void testSetHealth() {
        double org = baseMon.getHealth();
        baseMon.setHealth(25);
        Assert.assertNotEquals(org, baseMon.getHealth());
    }

    @Test
    public void testSetWeatherBonus() {
        double org = baseMon.getWeatherBonus();
        baseMon.setWeatherBonus(1.25);
        Assert.assertNotEquals(org, baseMon.getWeatherBonus());
    }

    @Test
    public void testSetTypeBonus() {
        double org = baseMon.getTypeBonus();
        baseMon.setTypeBonus(0.75);
        Assert.assertNotEquals(org, baseMon.getTypeBonus());
    }

    @Test
    public void testGetWeatherBonus() {
        Assert.assertNotNull(baseMon.getWeatherBonus());
    }

    @Test
    public void testGetTypeBonus() {
        Assert.assertNotNull(baseMon.getTypeBonus());
    }

    @Test
    public void testGetType() {
         Assert.assertNotNull(baseMon.getType());
    }

}
