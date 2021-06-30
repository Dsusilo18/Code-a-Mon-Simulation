
/**
 * An object class that uses the Decorator design pattern to edit a basic water
 * type code-a-mon and add more attack point as a reward for evolving.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class WaterEvo extends MonsterDecorator {

    private double healthBuff;

    public WaterEvo(Monster mons) {
        super(mons);
    }

    @Override
    public double getHealth() {
        double buff = super.getHealth();
        healthBuff = buff + 10.0;
        return healthBuff;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Water type monster evolved");
    }

}
