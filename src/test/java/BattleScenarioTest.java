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
public class BattleScenarioTest {

    MonsterFactory monFact;
    Trainer Drake;
    Trainer John;
    Monster randomMon;
    BattleScenario trainBattle;
    BattleScenario wildBattle;

    public BattleScenarioTest() {
        monFact = new MonsterFactory();
        Drake = new Trainer("drake");
        John = new Trainer("john");
        randomMon = monFact.getInstance("Water", false);
        trainBattle = new BattleScenario(Drake, John);
        wildBattle = new BattleScenario(Drake,
                randomMon);

    }

    @Test
    public void testSetEnvironment() {
        trainBattle.setEnvironment(Environment.Weather.neutral);
        assertEquals(Environment.Weather.neutral, trainBattle.getEnv().getWeather());
        wildBattle.setEnvironment(Environment.Weather.sunny);
        assertEquals(Environment.Weather.sunny, wildBattle.getEnv().getWeather());

    }

    @Test
    public void testInitiateBattleWild() {
        wildBattle.setEnvironment(Environment.Weather.neutral);
        int answer = wildBattle.initiateBattleWild();
        assertNotNull(wildBattle.getWin());
        if (answer != 7) {
            assertEquals(Drake.getIndMons().getAtt(), wildBattle.getWin().getAtt());
            assertEquals(Drake.getIndMons().getDef(), wildBattle.getWin().getDef());
        } else if (answer == 7) {
            assertEquals(randomMon.getAtt(), wildBattle.getWin().getAtt());
            assertEquals(randomMon.getDef(), wildBattle.getWin().getDef());
        }
    }

    @Test
    public void testInitiateBattle() {
        trainBattle.setEnvironment(Environment.Weather.neutral);
        int answer = trainBattle.initiateBattle();
        assertNotNull(trainBattle.getWin());
        if (answer != 7) {
            assertEquals(Drake.getIndMons().getAtt(), trainBattle.getWin().getAtt());
            assertEquals(Drake.getIndMons().getDef(), trainBattle.getWin().getDef());
        } else if (answer == 7) {
            assertEquals(John.getIndMons().getAtt(), trainBattle.getWin().getAtt());
            assertEquals(John.getIndMons().getDef(), trainBattle.getWin().getDef());
        }
    }

    @Test
    public void testCalculateDamage() {
        trainBattle.setEnvironment(Environment.Weather.neutral);
        Monster mon1 = monFact.getInstance("Water", false);
        Monster mon2 = monFact.getInstance("Fire", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon1.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon1.getDef(), trainBattle.fightTrain().getDef());
        mon1 = monFact.getInstance("Fire", false);
        mon2 = monFact.getInstance("Grass", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon1.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon1.getDef(), trainBattle.fightTrain().getDef());
        mon1 = monFact.getInstance("Grass", false);
        mon2 = monFact.getInstance("Fire", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon2.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon2.getDef(), trainBattle.fightTrain().getDef());
        mon1 = monFact.getInstance("Fire", false);
        mon2 = monFact.getInstance("Water", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon2.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon2.getDef(), trainBattle.fightTrain().getDef());

        trainBattle.setEnvironment(Environment.Weather.sunny);
        mon1 = monFact.getInstance("Fire", false);
        mon2 = monFact.getInstance("Water", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon1.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon1.getDef(), trainBattle.fightTrain().getDef());
        mon1 = monFact.getInstance("Fire", false);
        mon2 = monFact.getInstance("Grass", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon1.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon1.getDef(), trainBattle.fightTrain().getDef());

        mon1 = monFact.getInstance("Water", false);
        mon2 = monFact.getInstance("Fire", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon2.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon2.getDef(), trainBattle.fightTrain().getDef());
        mon1 = monFact.getInstance("Grass", false);
        mon2 = monFact.getInstance("Fire", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon2.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon2.getDef(), trainBattle.fightTrain().getDef());

        trainBattle.setEnvironment(Environment.Weather.rainy);
        mon1 = monFact.getInstance("Water", false);
        mon2 = monFact.getInstance("Fire", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon1.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon1.getDef(), trainBattle.fightTrain().getDef());
        mon1 = monFact.getInstance("Water", false);
        mon2 = monFact.getInstance("Grass", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon1.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon1.getDef(), trainBattle.fightTrain().getDef());

        mon1 = monFact.getInstance("Fire", false);
        mon2 = monFact.getInstance("Water", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon2.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon2.getDef(), trainBattle.fightTrain().getDef());
        mon1 = monFact.getInstance("Grass", false);
        mon2 = monFact.getInstance("Water", false);
        trainBattle.setMon1(mon1);
        trainBattle.setMon2(mon2);
        assertEquals(mon2.getAtt(), trainBattle.fightTrain().getAtt());
        assertEquals(mon2.getDef(), trainBattle.fightTrain().getDef());
    }

}
