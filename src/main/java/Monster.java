
/**
 * An interface class for code-a-mons. It keeps all the methods needed so that
 * you can set and get data about code-a-mons easily.
 *
 * @author daryl
 * @version 6/29/2021
 */
interface Monster {

    public void assemble();

    public int getAtt();

    public int getDef();

    public String getType();

    public double getHealth();

    public void setHealth(double newHealth);

    public void setStats(int attk, int deff, int hlth);

    public int getLevel();

    public void setLevel(int newLevel);

    public void setWeatherBonus(double bonus);

    public void setTypeBonus(double bonus);

    public double getWeatherBonus();

    public double getTypeBonus();

}
