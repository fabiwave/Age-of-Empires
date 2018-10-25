package CC3002.T1;

/**
 * AgeOfEmpiresObject
 *
 * @author Fabiola Rivera
 * Represents any entity that belongs to the game Age Empires
 */

public abstract class AgeOfEmpiresObjects {

    public int hitPoints;
    public int maxHitPoints;

    /**
     * Gets the hit points of the object
     *
     * @return int hitPoints
     */
    public int getHitPoints() {
        return this.hitPoints;
    }

    /**
     * Gets the maximum hit points of the object
     *
     * @return int hitPoints
     */
    public int getMaxHitPoints() {
        return this.maxHitPoints;
    }

    /**
     * Sets the hit points of the object
     *
     * @param points hitPoints
     */
    public void setHitPoints(int points) {
        this.hitPoints = points;
    }

    /**
     * Set the maximum hit points of the object
     *
     * @param points hitPoints
     */
    public void setMaxHitPoints(int points) {
        this.maxHitPoints = points;
    }

    /**
     * Returns true only if a object has more than 0 hit points
     *
     * @return boolean true if living
     */
    public boolean isAlive() {
        if (this.hitPoints == 0)
            return false;
        return true;
    }

    /**
     * Takes hit points from the object, according to the damage and the multiplier received
     *
     * @param damage   unmodified damage
     * @param enhancer multiplier of damage
     */
    public void getHit(int damage, float enhancer) {
        int health = (this.getHitPoints() - (int) (damage * enhancer));

        if (health >= 0.0) {
            this.setHitPoints(health);
        } else {
            this.setHitPoints(0);
        }
    }

    /**
     * Heals the object according to the heal and the multiplier received
     *
     * @param medicine heal
     * @param enhancer multiplier
     */
    public void getHeal(int medicine, float enhancer) {
        int health = (this.getHitPoints() + (int) (medicine * enhancer));
        int maxHealth = this.getMaxHitPoints();

        if (health <= maxHealth) {
            this.setHitPoints(health);
        } else {
            this.setHitPoints(maxHitPoints);
        }
    }
}
