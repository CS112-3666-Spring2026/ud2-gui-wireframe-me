package cs112.ud2;

public class TowerTester {
    public static void main(String[] args) {
        Enemy enemy = new Enemy("Goblin", 100, 1.0, 10);

        Tower archer = new ArcherTower();
        Tower cannon = new CannonTower();

        System.out.println(enemy);

        archer.attack(enemy);
        System.out.println("After archer attack:");
        System.out.println(enemy);

        cannon.attack(enemy);
        System.out.println("After cannon attack:");
        System.out.println(enemy);
    }
}