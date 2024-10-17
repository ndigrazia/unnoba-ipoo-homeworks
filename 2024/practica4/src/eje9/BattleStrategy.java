package eje9;

public interface BattleStrategy {
    
    default String getStrategyName() {
        return getClass().getSimpleName();
    }
    
}
