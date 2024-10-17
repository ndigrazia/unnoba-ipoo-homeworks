package eje9;

import java.util.Random;

import eje9.attack.LaserAttack;
import eje9.attack.MissileAttack;
import eje9.attack.PunchAttack;
import eje9.defense.ArmorDefense;
import eje9.defense.BonusDefense;
import eje9.defense.ShieldDefense;

public class RandomStrategySelector {

    private static final Random rand = new Random();

    private static final AttackStrategy[] ATTACK_STRATEGIES = {
        new PunchAttack(),
        new LaserAttack(),
        new MissileAttack(),
        new PunchAttack()
    };

    private static final DefenseStrategy[] DEFENSE_STRATEGIES = {
        new ArmorDefense(),
        new BonusDefense(),
        new ShieldDefense()
    };

    public static AttackStrategy getRandomAttackStrategy() {
        return ATTACK_STRATEGIES[rand.nextInt(ATTACK_STRATEGIES.length)];
    }

    public static DefenseStrategy getRandomDefenseStrategy() {
        return DEFENSE_STRATEGIES[rand.nextInt(DEFENSE_STRATEGIES.length)];
    }
}
