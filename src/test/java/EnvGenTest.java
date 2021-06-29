/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;

/**
 *
 * @author daryl
 */
public class EnvGenTest {
    EnvGen gen;
    EnvGen gen2;
    EnvGen gen3;
    public EnvGenTest() {
        gen = new EnvGen();
        Assert.assertNotNull(gen.getEnv().getWeather());
        gen2 = new EnvGen();
        Assert.assertNotNull(gen.getEnv().getWeather());
        gen3 = new EnvGen();
        Assert.assertNotNull(gen.getEnv().getWeather());
        
    }   
}
