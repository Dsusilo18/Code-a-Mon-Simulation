
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daryl
 */
public class Main {

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
