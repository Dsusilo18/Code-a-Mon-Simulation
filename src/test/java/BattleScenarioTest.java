
/**
 * A test to see if all the methods in the BattleScenerio class are all working
 * properly and that battles and fights can be simulated properly. Also makes
 * sure that CalculateDamage takes Type bonus and weather bonus in consideration.
 *
 * @author daryl
 * @version 6/29/2021
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BattleScenarioTest {

    MonsterFactory monFact;
    Trainer drake;
    Trainer john;
    Monster randomMon;
    BattleScenario trainBattle;
    BattleScenario wildBattle;

    /**
     * Tests the constructor to see if a new battle scenario can be created and
     * that the trainers are accepted and stored.
     */
    public BattleScenarioTest() {
        monFact = new MonsterFactory();
        drake = new Trainer("drake");
        john = new Trainer("john");
        randomMon = monFact.getInstance("Water", false);
        trainBattle = new BattleScenario(drake, john);
        wildBattle = new BattleScenario(drake,
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
            assertEquals(drake.getIndMons().getAtt(), wildBattle.getWin().getAtt());
            assertEquals(drake.getIndMons().getDef(), wildBattle.getWin().getDef());
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
            assertEquals(drake.getIndMons().getAtt(), trainBattle.getWin().getAtt());
            assertEquals(drake.getIndMons().getDef(), trainBattle.getWin().getDef());
        } else if (answer == 7) {
            assertEquals(john.getIndMons().getAtt(), trainBattle.getWin().getAtt());
            assertEquals(john.getIndMons().getDef(), trainBattle.getWin().getDef());
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
