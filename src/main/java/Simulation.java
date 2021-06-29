
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daryl
 */
public class Simulation {

    private Trainer person1;
    private Trainer person2;
    private Random rand = new Random();
    private String day = "day";
    private int victories = 0;
    private BattleArena battleMediator = new BattleArenaMed();
    private boolean gameContinue = true;

    public Simulation(Trainer newTrainer1, Trainer newTrainer2) {
        person1 = newTrainer1;
        person2 = newTrainer2;
    }

    public Monster monsGenerator() {
        int typeSelector = rand.nextInt(3);
        MonsterFactory monsFact = new MonsterFactory();
        switch (typeSelector) {
            case 0:
                return monsFact.getInstance("Fire", false);
            case 1:
                return monsFact.getInstance("Water", false);
            case 2:
                return monsFact.getInstance("Grass", false);
            default:
                break;
        }
        return null;
    }

    public void switchDay() {
        if (day.equals("day")) {
            day = "night";
        } else {
            day = "day";
        }
    }

    public void init() {
        boolean firstTime = true;
        System.out.println("Start of code-a-mon game simulation");
        while (gameContinue) {
            System.out.println("\nTime: " + day);
            int choice = 1;
            if (choice == 1 && firstTime) {
                firstTime = false;
                Arena arenaB = new Arena(battleMediator);
                Fight fightSim = new Fight(battleMediator);

                battleMediator.registerArena(arenaB);
                battleMediator.registerFight(fightSim);

                arenaB.battle();
                fightSim.battle();

                BattleScenario battle = new BattleScenario(person1, person2);
                EnvGen gen = new EnvGen();
                Environment genWeather = gen.getEnv();
                battle.setEnvironment(genWeather.getWeather());
                checkEvo(battle.initiateBattle());

                fightSim.battleOver();

            } else {

                Arena arenaTwoB = new Arena(battleMediator);
                Fight fightSimTwo = new Fight(battleMediator);

                battleMediator.registerArena(arenaTwoB);
                battleMediator.registerFight(fightSimTwo);

                arenaTwoB.battle();
                fightSimTwo.battle();
                Monster newMons = monsGenerator();
                BattleScenario battle = new BattleScenario(person1, newMons);
                EnvGen gen = new EnvGen();
                Environment genWeather = gen.getEnv();
                battle.setEnvironment(genWeather.getWeather());
                checkEvo(battle.initiateBattleWild());
                System.out.println(person1.getName() + " caught a new code-a-mon!");
                person1.obtMons(newMons);

                fightSimTwo.battleOver();
            }
            switchDay();
            victories++;
        }

    }

    public void checkEvo(int index) {
        MonsterFactory monsFact = new MonsterFactory();
        if (index != 7) {
            Monster temp = person1.getIndMons();
            int lvl = temp.getLevel();
            if (lvl % 2 == 0) {
                String type = temp.getType();
                person1.setMons(monsFact.getInstance(type, true));
                person1.setLevel(lvl + 1);
                System.out.println(person1.getName() + "'s code-a-mon have evolved"
                        + " at level: " + lvl);
            } else {
                person1.setLevel(lvl + 1);
            }
        } else {
            System.out.println("\n" + person1.getName() + " has " + victories + " victories!");
            System.out.println("End of simulation.");
            gameContinue = false;
        }
    }

}
