
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
        Scanner input = new Scanner(System.in, "UTF-8");
        System.out.println("How many simulations would you like to run?");
        int times = input.nextInt();
        int i = 1;
        while (times != 0) {
            System.out.println("\nSimulation: " + i + "");
            System.out.println("---------------------------\n");
            john = new Trainer("John");
            ash = new Trainer("Ash");
            sim = new Simulation(ash, john);
            sim.init();
            times--;
            i++;
        }

    }
}
