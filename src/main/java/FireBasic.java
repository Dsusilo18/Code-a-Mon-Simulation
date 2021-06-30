
/**
 * Used as an object class that uses the Decorator design pattern. Used to
 * initialize and create a basic fire type code-a-mon.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class FireBasic extends MonsterDecorator {

    private String type = "Fire";

    public FireBasic(Monster mons) {
        super(mons);
        super.setStats(70, 40, 90);
    }

    public String getType() {
        return type;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Created Fire type monster");
    }
}
