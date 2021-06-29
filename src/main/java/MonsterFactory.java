/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
 */
public class MonsterFactory {

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

