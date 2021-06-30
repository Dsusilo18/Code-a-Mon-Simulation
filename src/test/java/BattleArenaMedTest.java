
/**
 * A test to see if the BattleArenaMed class can be used to register fights and
 * arenas as well as set availability status of arenas.
 *
 * @author daryl
 * @version 6/29/2021
 */
import org.junit.Assert;
import org.junit.Test;

public class BattleArenaMedTest {

    BattleArenaMed battleArena;

    public BattleArenaMedTest() {
        battleArena = new BattleArenaMed();
    }

    @Test
    public void testRegisterFight() {
        Fight fightSim = new Fight(battleArena);
        battleArena.registerFight(fightSim);
        Assert.assertNotNull(battleArena.getFight());

    }

    @Test
    public void testRegisterArena() {
        Arena arenaB = new Arena(battleArena);
        battleArena.registerArena(arenaB);
        Assert.assertNotNull(battleArena.getArena());
    }

    @Test
    public void testSetAvailabilityStatus() {
        battleArena.setAvailabilityStatus(true);
        Assert.assertEquals(true, battleArena.isAvailable());
    }

}
