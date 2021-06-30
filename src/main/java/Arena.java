
/**
 * Used as a class for the mediator design pattern so that a fight would have
 * an arena that can be used.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class Arena implements Command {

    private BattleArena battleMediator;

    Arena(BattleArena mediatorB) {
        this.battleMediator = mediatorB;
    }

    @Override
    public void battle() {
        System.out.println("\nArena is available for battle");
        battleMediator.setAvailabilityStatus(true);
    }
}
