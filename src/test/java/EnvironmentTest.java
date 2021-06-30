
/**
 * A test to see if an Environment object can be created and that its setters
 * and getters function properly.
 *
 * @author daryl
 * @version 6/29/2021
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class EnvironmentTest {

    Environment env;
    Environment.Weather newWeather;

    public EnvironmentTest() {
        env = new Environment();
    }

    @Test
    public void testGetBuffedType() {
        assertNotEquals("Water", env.getBuffedType());
        env = new Environment(newWeather.rainy);
        assertEquals("Water", env.getBuffedType());
        env = new Environment(newWeather.sunny);
        assertEquals("Fire", env.getBuffedType());
    }

    @Test
    public void testGetDebuffedType() {
        env = new Environment(newWeather.rainy);
        assertEquals("Fire", env.getDebuffedType());
        env = new Environment(newWeather.sunny);
        assertEquals("Water", env.getDebuffedType());
    }

    @Test
    public void testGetDebuffMod() {
        assertEquals(0.75, env.getDebuffMod(), 0.1);
    }

    @Test
    public void testGetBuffMod() {
        assertEquals(1.25, env.getBuffMod(), 0.1);
    }

    @Test
    public void testGetWeather() {
        env = new Environment(newWeather.rainy);
        assertEquals(newWeather.rainy, env.getWeather());
        env = new Environment(newWeather.sunny);
        assertEquals(newWeather.sunny, env.getWeather());
        env = new Environment(newWeather.neutral);
        assertEquals(newWeather.neutral, env.getWeather());
    }

}
