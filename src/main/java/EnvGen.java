
/**
 * A class used in the simulation to create random types of weather so that the
 * world can be a bit more realistic and random.
 *
 * @author daryl
 * @version 6/29/2021
 */
import java.util.Random;

public class EnvGen {

    private Random rand = new Random();
    private Environment env = new Environment();

    /**
     * The constructor that is used to create random numbers used to randomly
     * create different type of weather.
     */
    public EnvGen() {
        int envSelector = rand.nextInt(3);
        switch (envSelector) {
            case 0:
                env = new Environment(Environment.Weather.sunny);
                break;
            case 1:
                env = new Environment(Environment.Weather.rainy);
                break;
            case 2:
                env = new Environment(Environment.Weather.neutral);
                break;
            default:
                break;
        }
    }

    public Environment getEnv() {
        return env;
    }
}
