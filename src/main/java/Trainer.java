
/**
 * A class used to store any information regarding to the Trainer. Also used to
 * access and set any data about the trainer or the trainer's code-a-mon.
 *
 * @author daryl
 * @version 6/29/2021
 */
import java.util.Random;

public class Trainer {

    private int count = 1;
    private String name;
    private Monster[] monsList = new Monster[7];
    private Random rand = new Random();
    private MonsterFactory monsFact = new MonsterFactory();

    /**
     * Constructor used to intitialize the trainer and its name as well as
     * randomly pick a type and create the trainer's first code-a-mon.
     *
     * @param newName the name of the trainer.
     */
    public Trainer(String newName) {
        this.name = newName;
        int typeSelector = rand.nextInt(3);
        switch (typeSelector) {
            case 0:
                monsList[0] = monsFact.getInstance("Fire", false);
                break;
            case 1:
                monsList[0] = monsFact.getInstance("Water", false);
                break;
            case 2:
                monsList[0] = monsFact.getInstance("Grass", false);
                break;
            default:
                break;
        }
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return monsList[0].getLevel();
    }

    /**
     * A method used to set the level of the main code-a-mon owned by the
     * trainer.
     *
     * @param lvl the level that the code-a-mon should have.
     */
    public void setLevel(int lvl) {
        if (lvl > 0) {
            monsList[0].setLevel(lvl);
        }
    }

    /**
     * Used to store any code-a-mon that the trainer won by fighting wild
     * code-a-mon.
     *
     * @param mons the Monster object that is supposed to be added to the list
     * of code-a-mon the trainer have.
     */
    public void obtMons(Monster mons) {
        if (count == 7) {
            System.out.println("However, trainer already reached max number of "
                    + "code-a-mons");
        } else {
            monsList[count] = mons;
            count++;

        }

    }

    /**
     * A method used to get an individual code-a-mon from the list of monsters
     * owned by the trainer. This is usually the main code-a-mon and is set to
     * be the first code-a-mon that the trainer owned.
     *
     * @return the main code-a-mon the trainer uses to battle.
     */
    public Monster getIndMons() {
        if (monsList[0].getHealth() != 0) {
            return monsList[0];
        } else {
            return null;
        }

    }

    public void setMons(Monster mons) {
        monsList[0] = mons;
    }
}
