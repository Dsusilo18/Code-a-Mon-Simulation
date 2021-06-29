/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class BattleArenaMed implements BattleArena {

    private Fight fightB;
    private Arena arenaB;
    public Boolean avilable;

    @Override
    public void registerFight(Fight fight) {
        this.fightB = fight;
    }

    @Override
    public void registerArena(Arena zone) {
        this.arenaB = zone;
    }

    @Override
    public void setAvailabilityStatus(Boolean status) {
        this.avilable = status;
    }

    @Override
    public Boolean isAvailable() {
        return avilable;
    }

    public Fight getFight() {
        return fightB;
    }

    public Arena getArena() {
        return arenaB;
    }
}
