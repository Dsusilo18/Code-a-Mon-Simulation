
/**
 * Used as a base class for the Decorator design pattern. Used to contain any
 * basic feature of a monster.
 *
 * @author daryl
 * @version 6/29/2021
 */
import java.util.Random;

public class BasicMonster implements Monster {

    private int att;
    private int def;
    private int lvl;
    private double health;
    Random numGen = new Random();
    private double weatherBonus;
    private double typeBonus;
    private String type = "Neutral";

    public int getAtt() {
        return att;
    }

    public BasicMonster() {
        this.setNewStats();
    }

    /**
     * Used to initialize all the stats for the code-a-mon by creating random
     * numbers.
     *
     */
    public void setNewStats() {
        int stats = numGen.nextInt(101);
        att = stats;
        stats = numGen.nextInt(101);
        def = stats;
        stats = numGen.nextInt(101);
        health = stats;
        lvl = 1;
        weatherBonus = 1.0;
        typeBonus = 1.0;
    }

    /**
     * Used to set specific stat points for the code-a-mon.
     *
     * @param attk is the attack point that is to be set.
     * @param deff is the defend point that is to be set.
     * @param hlth is the health point that is to be set.
     */
    public void setStats(int attk, int deff, int hlth) {
        att = attk;
        def = deff;
        health = hlth;
    }

    @Override
    public void assemble() {
        System.out.println("New Monster created");
    }

    @Override
    public int getDef() {
        return def;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public int getLevel() {
        return this.lvl;
    }

    @Override
    public void setLevel(int lvlNew) {
        this.lvl = lvlNew;
    }

    @Override
    public void setHealth(double newHealth) {
        this.health = newHealth;
    }

    @Override
    public void setWeatherBonus(double bonus) {
        this.weatherBonus = bonus;
    }

    @Override
    public void setTypeBonus(double bonus) {
        this.typeBonus = bonus;
    }

    @Override
    public double getWeatherBonus() {
        return weatherBonus;
    }

    @Override
    public double getTypeBonus() {
        return typeBonus;
    }

    @Override
    public String getType() {
        return type;
    }
}
