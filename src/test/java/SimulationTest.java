
/**
 * A test to see if all the methods in the simulation class are all working
 * properly and that the simulation as a whole will work. Makes sure that a
 * code-a-mon is able to evolve after every 5 levels.
 *
 * @author daryl
 * @version 6/29/2021
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SimulationTest {

    private Trainer person1;
    private Trainer person2;
    Simulation sim;

    /**
     * Tests the constructor to see if a new simulation object can be created
     * with the specific trainers.
     */
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
