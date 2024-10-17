package eje9.defense;

import eje9.DefenseStrategy;

public class ArmorDefense implements DefenseStrategy {

    @Override
    public int defend(int attack) {
        return attack - 50;
    }

}
