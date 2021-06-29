
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
public class Trainer {

    private int count = 1;
    private String name;
    private Monster[] monsList = new Monster[7];
    private Random rand = new Random();
    private MonsterFactory monsFact = new MonsterFactory();

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
    
    public int getLevel(){
        return monsList[0].getLevel();
    }

    public void setLevel(int lvl) {
        if (lvl > 0) {
            monsList[0].setLevel(lvl);
        }
    }

    public void obtMons(Monster mons) {
        if (count == 7) {
            System.out.println("However, trainer already reached max number of "
                    + "code-a-mons");
        } else {
            monsList[count] = mons;
            count++;

        }

    }

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
