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
