package eje9;

public class Battle {

    private Robot robot1;
    private Robot robot2;

    public Battle(Robot robot1, Robot robot2) {
        this.robot1 = robot1;
        this.robot2 = robot2;
    }
    public void start() {
        System.out.println("La batalla comienza entre "
        + robot1.getName()
        + " y " + robot2.getName());
        
        // Mientras los dos tengan vidas seguimos luchando
        while (robot1.isAlive() && robot2.isAlive()) {
            takeTurn(robot1, robot2);
            if (robot2.isAlive()) {
                takeTurn(robot2, robot1);
            }
        }
       
        if (robot1.isAlive()) {
            System.out.println(robot1.getName()
            + " gana la batalla con " + robot1.getHealth()
            + " puntos de vida restantes.");
        } else {
            System.out.println(robot2.getName()
            + " gana la batalla con " + robot2.getHealth()
            + " puntos de vida restantes.");
        }
    }
    private void takeTurn(Robot attacker, Robot defender) {
        int damage = attacker.attack();
        defender.defend(damage);
        System.out.println(attacker.getName()
        + " ataca a "
        + defender.getName()
        + " causando "
        + damage
        + " puntos de daño.");
        System.out.println(defender.getName()
        + " tiene " + defender.getHealth()
        + " puntos de vida restantes.");
        }
}
