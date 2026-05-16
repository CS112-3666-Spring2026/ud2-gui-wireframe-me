package cs112.ud2;
    // Represents a cannon tower.
    // Cannon towers cost more but deal more damage.
public class CannonTower extends Tower {

    public CannonTower() {
        super("Cannon Tower", 30, 120.0, 75);
    }

    @Override
    public void attack(Enemy enemy) {
        if (enemy != null && !enemy.isDefeated()) {
            enemy.takeDamage(getDamage());
        }
    }
}