/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
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
