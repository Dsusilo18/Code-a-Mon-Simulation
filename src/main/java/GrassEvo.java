/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
 */
public class GrassEvo extends MonsterDecorator {

    private int deffBuff;

    public GrassEvo(Monster mons) {
        super(mons);
    }

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
