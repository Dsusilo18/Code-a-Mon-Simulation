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
public class TrainerTest {

    Trainer john;
    Trainer paul;

    public TrainerTest() {
        john = new Trainer("john");
        assertEquals("john", john.getName());
        paul = new Trainer("paul");
        assertEquals("paul", paul.getName());
    }

    @Test
    public void testGetCount() {
        assertNotNull(john.getCount());
    }

    @Test
    public void testSetLevel() {
        john.setLevel(5);
        assertEquals(5, john.getIndMons().getLevel());
        john.setLevel(10);
        assertEquals(10, john.getIndMons().getLevel());
        john.setLevel(-5);
        assertEquals(10, john.getIndMons().getLevel());
        john.setLevel(0);
        assertEquals(10, john.getIndMons().getLevel());
    }

    @Test
    public void testObtMons() {
        MonsterFactory monsFact = new MonsterFactory();
        john.obtMons(monsFact.getInstance("Fire", false));
        assertEquals(2, john.getCount());
        john.obtMons(monsFact.getInstance("Water", false));
        assertEquals(3, john.getCount());
        john.obtMons(monsFact.getInstance("Grass", false));
        assertEquals(4, john.getCount());
        john.obtMons(monsFact.getInstance("Fire", true));
        assertEquals(5, john.getCount());
        john.obtMons(monsFact.getInstance("Water", true));
        assertEquals(6, john.getCount());
        john.obtMons(monsFact.getInstance("Grass", true));
        assertEquals(7, john.getCount());
        john.obtMons(monsFact.getInstance("Grass", true));
        assertEquals(7, john.getCount());
        john.obtMons(monsFact.getInstance("Fire", true));
        assertEquals(7, john.getCount());
    }

    @Test
    public void testGetIndMons() {
        paul.getIndMons().setHealth(0);
        assertEquals(null, paul.getIndMons());
    }

    @Test
    public void testSetMons() {
        MonsterFactory monsFact = new MonsterFactory();
        Monster mon = john.getIndMons();
        String jtype = john.getIndMons().getType();
        john.setMons(monsFact.getInstance(jtype, true));
        assertNotEquals(mon, john.getIndMons());
    }

}
