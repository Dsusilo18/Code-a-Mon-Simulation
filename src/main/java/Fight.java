
/**
 * Used as an object class for the Mediator design pattern to initialize a
 * fight that is needed to start and that requires an arena to start.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class Fight implements Command {

    private BattleArena battleMediator;

    Fight(BattleArena medB) {
        this.battleMediator = medB;
    }

    @Override
    public void battle() {
        if (battleMediator.isAvailable()) {
            System.out.println("Battle Started Successfully\n");
            battleMediator.setAvailabilityStatus(false);
        } else {
            System.out.println("Wating for arena");
        }
    }

    public void battleOver() {
        System.out.println("\nBattle is over");
        battleMediator.setAvailabilityStatus(true);
    }

}
