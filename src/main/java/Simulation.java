
/**
 * The main class that handles the actual game simulation and all its event.
 *
 * @author daryl
 * @version 6/29/2021
 */
import java.util.Random;

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

    /**
     * A method used to randomly generate new code-a-mon and is used for
     * battling with wild code-a-mon.
     *
     * @return the newly created code-a-mon.
     */
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

    /**
     * A method used to switch the day variable from day to night or vice versa
     * after every cycle.
     */
    public void switchDay() {
        if (day.equals("day")) {
            day = "night";
        } else {
            day = "day";
        }
    }

    /**
     * The method that starts the cycles of the simulation and handles all event
     * of the simulation.
     */
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

    /**
     * Checks to see if the code-a-mon can be evolved or if the simulation
     * should end because the trainer have no more code-a-mon to fight with.
     *
     * @param index the determining factor to know if the trainer still have a 
     * code-a-mon to fight with.
     */
    public void checkEvo(int index) {
        MonsterFactory monsFact = new MonsterFactory();
        if (index != 7) {
            int lvl = person1.getLevel();
            if (lvl % 5 == 0) {
                String type = person1.getIndMons().getType();
                person1.setMons(monsFact.getInstance(type, true));
                person1.setLevel(lvl + 1);
                System.out.println(person1.getName() + "'s code-a-mon have evolved"
                        + " at level: " + lvl);
            } else {
                person1.setLevel(lvl + 1);
                System.out.println(person1.getClass() + "'s code-a-mon is now "
                        + "level: " + person1.getLevel());
            }
        } else {
            System.out.println("\n" + person1.getName() + " has " + victories + " victories!");
            System.out.println("End of simulation.");
            gameContinue = false;
        }
    }

    public Trainer getTrainer() {
        return person1;
    }

}
