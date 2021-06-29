/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daryl
 */
public class SimulationTest {

    private Trainer person1;
    private Trainer person2;
    Simulation sim;

    public SimulationTest() {
        person1 = new Trainer("john");
        person2 = new Trainer("paul");
        sim = new Simulation(person1, person2);
    }

    @Test
    public void testMonsGenerator() {
        Monster mon = sim.monsGenerator();
        assertNotNull(mon);
        Monster mon2 = sim.monsGenerator();
        assertNotNull(mon2);
        assertNotEquals(mon, mon2);
    }

    @Test
    public void testInit() {
        sim.init();
    }

    @Test
    public void testCheckEvo() {
        sim.checkEvo(1);
        assertEquals(2, sim.getTrainer().getIndMons().getLevel());
        sim.checkEvo(-1);
        assertEquals(3, sim.getTrainer().getIndMons().getLevel());
        sim.checkEvo(7);
        assertEquals(3, sim.getTrainer().getIndMons().getLevel());
        sim.checkEvo(8);
        assertEquals(4, sim.getTrainer().getIndMons().getLevel());
        sim.checkEvo(6);
        assertEquals(5, sim.getTrainer().getIndMons().getLevel());
        Monster org = sim.getTrainer().getIndMons();
        sim.checkEvo(100);
        assertEquals(6, sim.getTrainer().getIndMons().getLevel());
        assertNotEquals(org, sim.getTrainer().getIndMons());

    }

}
