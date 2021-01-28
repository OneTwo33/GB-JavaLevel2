package ru.company.onetwo33.javalvl2.homework1;

public class Test {
    public static void main(String[] args) {
        Sportable[] team = {new Robot(500, 4), new Cat(250, 2), new Human(350, 3)};
        Blockable[] barriers = {new Wall(2), new RunningTrack(280), new RunningTrack(300), new Wall(3), new RunningTrack(450), new Wall(4), new Wall(6)};

        for (Sportable member : team) {
            int i = 0;
            for (Blockable barrier : barriers) {
                System.out.println("Препятствие номер " + ++i);
                if (!barrier.action(member)) break;
            }
        }
    }
}
