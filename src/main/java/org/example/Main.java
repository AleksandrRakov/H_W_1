package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // всегда меняет дверь
        MontyHallParadox simulationTrue = new MontyHallParadox(1000, true);
        System.out.println("Игрок всегда меняет дверь");
        simulationTrue.runGame();

        // никогда не меняет дверь
        MontyHallParadox simulationFalse = new MontyHallParadox(1000, false);
        System.out.println("Игрок никогда не меняет дверь");
        simulationFalse.runGame();
    }
}