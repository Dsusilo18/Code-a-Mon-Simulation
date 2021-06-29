/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
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