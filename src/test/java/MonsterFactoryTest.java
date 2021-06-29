/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daryl
 */
public class MonsterFactoryTest {

    MonsterFactory monFact;

    public MonsterFactoryTest() {
        monFact = new MonsterFactory();
    }

    @Test
    public void testGetInstance() {
        Monster mon1 = monFact.getInstance("Fire", false);
        Monster mon2 = monFact.getInstance("Fire", false);
        assertNotEquals(mon1, mon2);

        mon1 = monFact.getInstance("Water", false);
        mon2 = monFact.getInstance("Water", false);
        assertNotEquals(mon1, mon2);

        mon1 = monFact.getInstance("Grass", false);
        mon2 = monFact.getInstance("Grass", false);
        assertNotEquals(mon1, mon2);

        mon1 = monFact.getInstance("Fire", true);
        mon2 = monFact.getInstance("Fire", true);
        assertNotEquals(mon1, mon2);

        mon1 = monFact.getInstance("Grass", true);
        mon2 = monFact.getInstance("Grass", true);
        assertNotEquals(mon1, mon2);

        mon1 = monFact.getInstance("Water", true);
        mon2 = monFact.getInstance("Water", true);
        assertNotEquals(mon1, mon2);
    }

}
