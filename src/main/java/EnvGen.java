
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daryl
 */
public class EnvGen {

    private Random rand = new Random();
    private Environment env = new Environment();

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
