package cs112.ud2;

public class EnemyTester {
    public static void main(String[] args) {
        System.out.println("Testing Enemy class...");
        System.out.println();

        Enemy defaultEnemy = new Enemy();
        System.out.println("Default enemy:");
        System.out.println(defaultEnemy);
        System.out.println();

        Enemy goblin = new Enemy("Goblin", 80, 1.5, 15);
        System.out.println("Custom enemy:");
        System.out.println(goblin);
        System.out.println();

        Enemy goblinCopy = new Enemy(goblin);
        System.out.println("Copied enemy:");
        System.out.println(goblinCopy);
        System.out.println();

        System.out.println("Testing getters:");
        System.out.println("Name: " + goblin.getName());
        System.out.println("Health: " + goblin.getHealth());
        System.out.println("Speed: " + goblin.getSpeed());
        System.out.println("Reward: " + goblin.getReward());
        System.out.println();

        System.out.println("Testing setters:");
        goblin.setName("Strong Goblin");
        goblin.setHealth(120);
        goblin.setSpeed(1.25);
        goblin.setReward(20);
        System.out.println(goblin);
        System.out.println();

        System.out.println("Testing invalid setter values:");
        goblin.setName("");
        goblin.setHealth(-50);
        goblin.setSpeed(-2.0);
        goblin.setReward(-10);
        System.out.println(goblin);
        System.out.println();

        System.out.println("Testing damage:");
        Enemy skeleton = new Enemy("Skeleton", 50, 1.2, 8);
        System.out.println("Before damage: " + skeleton);
        skeleton.takeDamage(20);
        System.out.println("After 20 damage: " + skeleton);
        skeleton.takeDamage(100);
        System.out.println("After 100 damage: " + skeleton);
        System.out.println("Is defeated? " + skeleton.isDefeated());
        System.out.println();

        System.out.println("Testing equals:");
        Enemy enemyOne = new Enemy("Slime", 30, 0.8, 5);
        Enemy enemyTwo = new Enemy("Slime", 30, 0.8, 5);
        Enemy enemyThree = new Enemy("Bat", 30, 2.0, 5);

        System.out.println("enemyOne equals enemyTwo: " + enemyOne.equals(enemyTwo));
        System.out.println("enemyOne equals enemyThree: " + enemyOne.equals(enemyThree));
        System.out.println();

        System.out.println("All tests complete.");
    }
}
