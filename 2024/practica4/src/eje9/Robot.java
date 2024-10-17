package eje9;

public class Robot {
    private String name;
    private int health;
    public Robot(String name) {
        this.name = name;
        this.health = 1000;
    }
    public int attack() {
        AttackStrategy attackStrategy =
            RandomStrategySelector.getRandomAttackStrategy();
        System.out.println("Using Attack-> " +
            attackStrategy.getStrategyName());
        return attackStrategy.attack();
    }
    public void defend(int damage) {
        DefenseStrategy defenseStrategy =
            RandomStrategySelector.getRandomDefenseStrategy();
        System.out.println("Using Defense-> " +
            defenseStrategy.getStrategyName());
        int damageReduced = defenseStrategy.defend(damage);
        health -= Math.max(damageReduced, 0);
    }

    public boolean isAlive() {
        return health > 0;
    }
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }
}
