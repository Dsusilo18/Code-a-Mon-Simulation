/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
 */
public class WaterEvo extends MonsterDecorator {

    private double healthBuff;

    public WaterEvo(Monster mons) {
        super(mons);
    }

    @Override
    public double getHealth() {
        double buff = super.getHealth();
        healthBuff = buff + 10.0;
        return healthBuff;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Water type monster evolved");
    }

}
