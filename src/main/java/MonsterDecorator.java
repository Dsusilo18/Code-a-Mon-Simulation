/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
 */
public class MonsterDecorator implements Monster {

    protected Monster mons;

    public MonsterDecorator(Monster insertedMons) {
        this.mons = insertedMons;
    }

    @Override
    public int getAtt() {
        return mons.getAtt();
    }

    @Override
    public void assemble() {
        this.mons.assemble();
    }

    @Override
    public int getDef() {
        return mons.getDef();
    }

    @Override
    public double getHealth() {
        return mons.getHealth();
    }

    @Override
    public int getLevel() {
        return mons.getLevel();
    }

    @Override
    public void setLevel(int newLevel) {
        mons.setLevel(newLevel);
    }

    @Override
    public void setHealth(double newHealth) {
        mons.setHealth(newHealth);
    }

    @Override
    public void setWeatherBonus(double bonus) {
        mons.setWeatherBonus(bonus);
    }

    @Override
    public void setTypeBonus(double bonus) {
        mons.setTypeBonus(bonus);
    }

    @Override
    public double getWeatherBonus() {
        return mons.getWeatherBonus();
    }

    @Override
    public double getTypeBonus() {
        return mons.getTypeBonus();
    }

    @Override
    public String getType() {
        return mons.getType();
    }
}




