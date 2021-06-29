/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daryl
 */
public class EnvironmentTest {

    Environment env;
    Environment.Weather newWeather;

    public EnvironmentTest() {
        env = new Environment();
    }

    @Test
    public void testGetBuffedType() {
        assertNotEquals("Water",env.getBuffedType());
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
