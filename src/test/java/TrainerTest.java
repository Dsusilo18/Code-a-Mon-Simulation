
/**
 * Test to see if the Trainer class conatins any methods that doesn't function
 * properly. Makes ure that only a certain amount of code-a-mon can be obtained
 * by a trainer, makes sure that only valid numbers can be considered as a level
 * when setting levels for a code-a-mon and make sure that you can set a
 * code-a-mon for the trainer.
 *
 * @author daryl
 * @version 6/29/2021
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TrainerTest {

    Trainer john;
    Trainer paul;

    /**
     * Tests to see if the consturctor will create a new trainer object and
     * store the name of the trainers inserted as a parameter.
     */
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
