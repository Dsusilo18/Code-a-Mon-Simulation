
/**
 * The main class used to start the simulation.
 *
 * @author daryl
 * @version 6/29/2021
 */
public class Main {

    /**
     * Main method that will start the simulation and create the necessary
     * trainer objects needed to start.
     *
     * @param args any argument that wants to be passed.
     */
    public static void main(String[] args) {
        Trainer john;
        Trainer ash;
        Simulation sim;
        john = new Trainer("John");
        ash = new Trainer("Ash");
        sim = new Simulation(ash, john);
        sim.init();
    }
}
