
/**
 * An object class that uses the Decorator design pattern to edit a basic fire
 * type code-a-mon and add more attack point as a reward for evolving.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class FireEvo extends MonsterDecorator {

    private int attBuff;

    public FireEvo(Monster mons) {
        super(mons);
    }

    @Override
    public int getAtt() {
        int buff = super.getAtt();
        attBuff = buff + 10;
        return attBuff;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Fire type monster evolved");
    }

}
