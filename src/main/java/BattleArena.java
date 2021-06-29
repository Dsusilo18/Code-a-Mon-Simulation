/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
 */
public interface BattleArena {

    public void registerFight(Fight fight);

    public void registerArena(Arena zone);

    public void setAvailabilityStatus(Boolean status);

    public Boolean isAvailable();
}

