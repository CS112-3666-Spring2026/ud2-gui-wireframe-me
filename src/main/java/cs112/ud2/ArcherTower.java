package cs112.ud2;


 // Represents an archer tower
 // Archer towers are cheaper and attack with lower damage
public class ArcherTower extends Tower {

    public ArcherTower() {
        super("Archer Tower", 15, 150.0, 50);
    }

    @Override
    public void attack(Enemy enemy) {
        if (enemy != null && !enemy.isDefeated()) {
            enemy.takeDamage(getDamage());
        }
    }
}