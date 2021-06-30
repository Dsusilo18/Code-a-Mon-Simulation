
/**
 * Used as an object class that uses the Decorator design pattern. Used to
 * initialize and create a basic grass type code-a-mon.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class GrassBasic extends MonsterDecorator {

    private String type = "Grass";

    public GrassBasic(Monster mons) {
        super(mons);
        super.setStats(30, 65, 105);
    }

    public String getType() {
        return type;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Created Grass type monster");
    }
}
