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
