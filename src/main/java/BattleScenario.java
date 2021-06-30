
public class BattleScenario {

    private int index = 0;
    private Monster mon1;
    private Monster mon2;
    private Trainer person1;
    private Trainer person2;
    private Environment battleWeather;
    private Monster winner;

    /**
     * Constructor for when a trainer is going to fight a wild code-a-mon that
     * doesn't have a trainer.
     *
     * @param person is the trainer that is battling a random code-a-mon.
     * @param pmon is the random code-a-mon that is battling the trainer.
     */
    public BattleScenario(Trainer person, Monster pmon) {
        person1 = person;
        setMon1(person1.getIndMons());
        setMon2(pmon);
    }

    /**
     * Constructor for when a Trainer is going to fight another Trainer.
     *
     * @param person a trainer that is battling.
     * @param personTwo another trainer that is in the fight.
     */
    public BattleScenario(Trainer person, Trainer personTwo) {
        person1 = person;
        person2 = personTwo;
        setMon1(person1.getIndMons());
        setMon2(person2.getIndMons());
    }

    /**
     * Sets environment of the battlefield, and sets buff/debuff modifiers for
     * all Code-a-mon on the field. If the Code-a-mon's type is buffed by the
     * environment,they receive a 25% multiplier to their attack and defense
     * stat. If the code-a-mon type is debuffed by the environment, they receive
     * a reduction of 25% to their attack and defense stat.
     *
     */
    public void setEnvironment(Environment.Weather pweather) {
        battleWeather = new Environment(pweather);
    }

    public Environment getEnv() {
        return battleWeather;
    }

    public Monster getWin() {
        return winner;
    }

    /**
     * Simulate battle with a wild code-a-mon that doesn't have any trainer.
     *
     * @return an index to show if the main trainer still have a code-a-mon that
     * is healthy or not.
     */
    public int initiateBattleWild() {
        System.out.println("The weather today is " + battleWeather.getWeather() + "!");
        System.out.println("\nBattle with a wild " + mon2.getType()
                + " code-a-mon is about to begin!");
        winner = fightWild();
        if (winner.equals(mon1)) {
            System.out.println(person1.getName() + " has won with a "
                    + mon1.getType() + " code-a-mon with "
                    + winner.getHealth() + " health left");
            return index;
        } else {
            System.out.println("Wild code-a-mon won!");
            return 7;
        }
    }

    /**
     * Simulate battle with two trainers that are fighting with one code-a-mon
     * each.
     *
     * @return an index to show if the main trainer still have a code-a-mon that
     * is healthy or not.
     */
    public int initiateBattle() {
        System.out.println("The weather today is " + battleWeather.getWeather() + "!");
        System.out.println("\nBattle with two trainers is about to begin!");

        winner = fightTrain();
        if (winner.equals(mon1)) {
            System.out.println(person1.getName() + " has won with a "
                    + mon1.getType() + " code-a-mon with "
                    + winner.getHealth() + " health left");
            return index;
        } else {
            System.out.println(person2.getName() + " has won with a "
                    + mon2.getType() + " code-a-mon with "
                    + winner.getHealth() + " health left");
            return 7;

        }

    }

    /**
     * Simulate and calculate damages and determine a winner for a fight between
     * two trainers.
     *
     * @return the code-a-mon that won the fight.
     */
    public Monster fightTrain() {
        int round = 1;
        double damage1;
        double damage2;

        while (true) {
            //Calculate damage:
            damage1 = calculateDamage(mon1.getAtt(), mon1, mon2);

            //Adjust mon2's health:
            mon2.setHealth(mon2.getHealth() - damage1);

            //Battle terminating condition:
            if (mon2.getHealth() <= 0.0) {
                System.out.println(person2.getName() + "'s code-a-mon has "
                        + "fainted in round " + round);
                return mon1;
            }

            //Calculate damage:
            damage2 = calculateDamage(mon2.getAtt(), mon2, mon1);

            //Adjust mon1's health:
            mon1.setHealth(mon1.getHealth() - damage2);

            //Battle terminating condition:
            if (mon1.getHealth() <= 0.0) {
                System.out.println(person1.getName() + " 's code-a-mon has "
                        + "fainted in round " + round);
                return mon2;
            }
            round++;
        } //end while
    }

    /**
     * Simulate and calculate damages and determine a winner for a fight between
     * a trainer and a wild code-a-mon.
     *
     * @return the code-a-mon that won the fight.
     */
    public Monster fightWild() {
        int round = 1;
        double damage1;
        double damage2;

        while (true) {
            //Calculate damage:
            damage1 = calculateDamage(mon1.getAtt(), mon1, mon2);

            //Adjust mon2's health:
            mon2.setHealth(mon2.getHealth() - damage1);

            //Battle terminating condition:
            if (mon2.getHealth() <= 0.0) {
                System.out.println("Wild code-a-mon has fainted in round " + round);
                return mon1;
            }

            //Calculate damage:
            damage2 = calculateDamage(mon2.getAtt(), mon2, mon1);

            //Adjust mon1's health:
            mon1.setHealth(mon1.getHealth() - damage2);

            //Battle terminating condition:
            if (mon1.getHealth() <= 0.0) {
                System.out.println(person1.getName() + " 's code-a-mon has "
                        + "fainted in round " + round);
                return mon2;
            }
            round++;
        } //end while
    }

    public void setMon1(Monster pmon) {
        mon1 = pmon;
    }

    public void setMon2(Monster pmon) {
        mon2 = pmon;
    }

    /**
     * Calculates the damage given to a defending code-a-mon from an attacking
     * code-a-mon.Makes sure that there is type bonus and weather bonus in
     * affect.
     *
     * @param pattack the attack point that the atacking code-a-mon have.
     * @param pattacker the attacking code-a-mon.
     * @param pdefender the defending code-a-mon.
     * @return
     */
    public double calculateDamage(int pattack, Monster pattacker, Monster pdefender) {

        if (pattacker.getType().equals(battleWeather.getBuffedType())) {
            pattacker.setWeatherBonus(battleWeather.getBuffMod());
        } else if (pattacker.getType().equals(battleWeather.getDebuffedType())) {
            pattacker.setWeatherBonus(battleWeather.getDebuffMod());
        }
        if (pdefender.getType().equals(battleWeather.getBuffedType())) {
            pdefender.setWeatherBonus(battleWeather.getBuffMod());
        } else if (pdefender.getType().equals(battleWeather.getDebuffedType())) {
            pdefender.setWeatherBonus(battleWeather.getDebuffMod());
        }

        switch (pattacker.getType()) {
            case "Fire":
                if (pdefender.getType().equals("Grass")) {
                    pattacker.setTypeBonus(1.25);
                    pdefender.setTypeBonus(0.75);
                } else if (pdefender.getType().equals("Water")) {
                    pattacker.setTypeBonus(0.75);
                    pdefender.setTypeBonus(1.25);
                }
                break;
            case "Water":
                if (pdefender.getType().equals("Fire")) {
                    pattacker.setTypeBonus(1.25);
                    pdefender.setTypeBonus(0.75);
                }
                break;
            case "Grass":
                if (pdefender.getType().equals("Fire")) {
                    pattacker.setTypeBonus(0.75);
                    pdefender.setTypeBonus(1.25);
                }
                break;
            default:
                break;
        }
        double totalDamage = (pattacker.getAtt() * pattacker.getWeatherBonus()
                * pattacker.getTypeBonus()) - (pdefender.getDef()
                * pdefender.getWeatherBonus() * pdefender.getTypeBonus());

        if (totalDamage < 0) {
            return 1;
        } else if (totalDamage == 0) {
            return 0;
        } else {
            return Math.round(totalDamage);
        }
    }

}
