
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