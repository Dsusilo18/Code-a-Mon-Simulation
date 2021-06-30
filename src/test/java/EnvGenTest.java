
/**
 * A test to see if all the methods in the EnvGen class are all working
 * properly and that a new weather type is being created every single time the
 * class is declared
 *
 * @author daryl
 * @version 6/29/2021
 */

import org.junit.Assert;

public class EnvGenTest {

    EnvGen gen;
    EnvGen gen2;
    EnvGen gen3;

    /**
     * Checks to see if a new weather type is created every time the constructor
     * is called.
     */
    public EnvGenTest() {
        gen = new EnvGen();
        Assert.assertNotNull(gen.getEnv().getWeather());
        gen2 = new EnvGen();
        Assert.assertNotNull(gen.getEnv().getWeather());
        gen3 = new EnvGen();
        Assert.assertNotNull(gen.getEnv().getWeather());

    }
}
