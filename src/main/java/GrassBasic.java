/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
 */
public class GrassBasic extends MonsterDecorator {

    private String type = "Grass";

    public GrassBasic(Monster mons) {
        super(mons);
    }

    public String getType() {
        return type;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Created Grass type monster");
    }
}