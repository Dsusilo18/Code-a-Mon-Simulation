/**
 * Tests the MonsterFactory class to see if it can actually create different 
 * type of code-a-mon and if it can created evolved types as well.
 *
 * @author daryl
 * @version 6/29/2021
 */
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

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
