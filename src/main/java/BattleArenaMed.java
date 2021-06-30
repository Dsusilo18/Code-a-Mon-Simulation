
/**
 * Used as a mediator class for the Mediator design pattern. Used to register
 * and store fight and arena information and keeps info on whether an arena is
 * available or not.
 *
 * @author daryl
 * @version 6/29/2021
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
