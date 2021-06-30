
/**
 * A decorator class for the Decorator design pattern that is used by other
 * classes to quickly modify the existing basic class. In this case, to quickly
 * modify the Basic code-a-mon into an evolved type or just a less basic type.
 *
 * @author daryl
 * @version 6/29/2021
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

    @Override
    public void setStats(int attk, int deff, int hlth) {
        mons.setStats(attk, deff, hlth);
    }
}
