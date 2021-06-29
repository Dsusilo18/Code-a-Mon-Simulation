/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
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