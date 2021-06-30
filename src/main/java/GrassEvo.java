
/**
 * An object class that uses the Decorator design pattern to edit a basic grass
 * type code-a-mon and add more attack point as a reward for evolving.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class GrassEvo extends MonsterDecorator {

    private int deffBuff;

    public GrassEvo(Monster mons) {
        super(mons);
    }

    /**
     * A method used to get the defend attack after the buff have been taking
     * into account.
     *
     * @return the defend point after the buff.
     */
    public int getDeff() {
        int buff = super.getDef();
        deffBuff = buff + 10;
        return deffBuff;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Grass type monster evolved");
    }

}
