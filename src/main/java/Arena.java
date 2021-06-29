/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
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

