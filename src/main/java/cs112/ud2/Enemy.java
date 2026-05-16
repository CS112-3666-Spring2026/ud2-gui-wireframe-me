package cs112.ud2;

public class Enemy {
    private String name;
    private int health;
    private double speed;
    private int reward;

    /**
     * No-argument constructor.
     * Creates a default enemy.
     */
    public Enemy() {
        name = "Basic Enemy";
        health = 100;
        speed = 1.0;
        reward = 10;
    }

    /**
     * Full constructor.
     *
     * @param name the enemy's name
     * @param health the enemy's health
     * @param speed the enemy's movement speed
     * @param reward the money rewarded when the enemy is defeated
     */
    public Enemy(String name, int health, double speed, int reward) {
        setName(name);
        setHealth(health);
        setSpeed(speed);
        setReward(reward);
    }

    /**
     * Copy constructor.
     *
     * @param other the enemy to copy
     */
    public Enemy(Enemy other) {
        if (other == null) {
            name = "Basic Enemy";
            health = 100;
            speed = 1.0;
            reward = 10;
        } else {
            name = other.name;
            health = other.health;
            speed = other.speed;
            reward = other.reward;
        }
    }

    /**
     * Gets the enemy's name.
     *
     * @return the enemy's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the enemy's health.
     *
     * @return the enemy's health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets the enemy's speed.
     *
     * @return the enemy's speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Gets the enemy's reward value.
     *
     * @return the reward for defeating the enemy
     */
    public int getReward() {
        return reward;
    }

    /**
     * Sets the enemy's name.
     * If the given name is null or blank default name is used.
     *
     * @param name the new enemy name
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Basic Enemy";
        } else {
            this.name = name;
        }
    }

    /**
     * Sets the enemy's health,
     * Health cannot be negative.
     *
     * @param health the new health value
     */
    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    /**
     * Sets the enemy's speed,
     * Speed must be positive.
     *
     * @param speed the new speed value
     */
    public void setSpeed(double speed) {
        if (speed <= 0) {
            this.speed = 1.0;
        } else {
            this.speed = speed;
        }
    }

    /*
     * Sets the enemy's reward.
     * Reward cannot be negative.
     *
     * @param reward the new reward value
     */
    public void setReward(int reward) {
        if (reward < 0) {
            this.reward = 0;
        } else {
            this.reward = reward;
        }
    }

    /**
     * Reduces the enemy's health by the given amount.
     * Damage cannot heal the enemy, and health cannot go below 0.
     *
     * @param amount the amount of damage taken
     */
    public void takeDamage(int amount) {
        if (amount > 0) {
            setHealth(health - amount);
        }
    }

    /**
     * Checks whether the enemy has been defeated.
     *
     * @return true if the enemy's health is 0, false otherwise
     */
    public boolean isDefeated() {
        return health == 0;
    }

    /**
     * Checks whether this enemy is equal to another object.
     *
     * @param obj the object to compare
     * @return true if the enemies have the same data, false otherwise
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Enemy)) {
            return false;
        }

        Enemy other = (Enemy) obj;

        return name.equals(other.name)
                && health == other.health
                && speed == other.speed
                && reward == other.reward;
    }

    /**
     * Returns a String representation of the enemy.
     *
     * @return enemy information as a String
     */
    public String toString() {
        return "Enemy{name='" + name + "', health=" + health
                + ", speed=" + speed + ", reward=" + reward + "}";
    }
}
