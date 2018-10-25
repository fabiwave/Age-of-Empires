package CC3002.T1;

public abstract class AgeOfEmpireObjects {

    public int hitPoints;
    public int maxHitPoints;

    //Methods related to the condition of been attackable
    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getMaxHitPoints() {
        return this.maxHitPoints;
    }

    public void setHitPoints(int points) {
        this.hitPoints = points;
    }

    public void setMaxHitPoints(int points) {
        this.maxHitPoints = points;
    }

    public boolean isAlive() {
        if (this.hitPoints == 0)
            return false;
        return true;
    }

    //Methods that work with hitPoints
    public void getHit(int damage, float enhancer) {
        int health = (this.getHitPoints() - (int)(damage * enhancer));

        if (health >= 0.0) {
            this.setHitPoints(health);
        } else {
            this.setHitPoints(0);
        }
    }

    public void getHeal(int medicine, float enhancer) {
        int health = (this.getHitPoints() + (int)(medicine * enhancer));
        int maxHealth = this.getMaxHitPoints();

        if (health <= maxHealth) {
            this.setHitPoints(health);
        } else {
            this.setHitPoints(maxHitPoints);
        }
    }
}
