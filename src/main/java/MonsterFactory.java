
/**
 * An factory class that is used for the Factory design pattern. It allows easy
 * creation of Monster classes for whenever a new code-a-mon needs to be created.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class MonsterFactory {

    /**
     * The method used to create a brand new Monster class based on the type
     * inserted or whether it is to be an evolution.
     *
     * @param type is the type of code-a-mon to be created.
     * @param evo the determining factor to know if an evolved state code-a-mon
     * is to be created or not.
     * @return the newly created code-a-mon.
     */
    public Monster getInstance(String type, boolean evo) {
        if ("Fire".equals(type)) {
            if (evo) {
                return new FireEvo(new FireBasic(new BasicMonster()));
            } else {
                return new FireBasic(new BasicMonster());
            }
        } else if ("Water".equals(type)) {
            if (evo) {
                return new WaterEvo(new WaterBasic(new BasicMonster()));
            } else {
                return new WaterBasic(new BasicMonster());
            }
        } else if ("Grass".equals(type)) {
            if (evo) {
                return new GrassEvo(new GrassBasic(new BasicMonster()));
            } else {
                return new GrassBasic(new BasicMonster());
            }
        }
        return null;
    }
}
