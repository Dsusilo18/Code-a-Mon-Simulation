
/**
 * A test for the arena class to see if the constructor and when the battle
 * method is called, no other fight can occur afterward unless the first one
 * ended.
 *
 * @author daryl
 * @version 6/29/2021
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArenaTest {

    Arena zone;
    BattleArena battleMediator = new BattleArenaMed();

    public ArenaTest() {

        zone = new Arena(battleMediator);
    }

    @Test
    public void testBattle() {
        zone.battle();
        assertEquals(true, battleMediator.isAvailable());
    }

}
