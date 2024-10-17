package eje9;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Robot1");
        Robot robot2 = new Robot("Robot2");
        Battle battle = new Battle(robot1, robot2);
        battle.start();
    }
    
}
