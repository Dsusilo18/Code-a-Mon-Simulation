
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
