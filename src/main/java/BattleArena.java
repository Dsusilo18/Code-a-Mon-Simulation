
/**
 * Interface containing all the necessary methods for classes needed for
 * the Mediator design pattern.
 *
 * @author daryl
 * @version 6/29/2021
 */
public interface BattleArena {

    public void registerFight(Fight fight);

    public void registerArena(Arena zone);

    public void setAvailabilityStatus(Boolean status);

    public Boolean isAvailable();
}
