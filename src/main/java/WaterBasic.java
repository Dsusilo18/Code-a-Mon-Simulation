
/**
 * Used as an object class that uses the Decorator design pattern. Used to
 * initialize and create a basic water type code-a-mon.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class WaterBasic extends MonsterDecorator {

    private String type = "Water";

    public WaterBasic(Monster mons) {
        super(mons);
        super.setStats(60, 40, 100);
    }

    public String getType() {
        return type;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Created Water type monster");
    }
}
