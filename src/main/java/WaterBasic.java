/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
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


