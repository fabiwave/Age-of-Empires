package CC3002.T1;

/**
 * Defines an object that can be attacked and its methods
 *
 * @author Fabiola Rivera
 */

public interface Attackable {

    /**
     * Gets the hit points of the object
     *
     * @return int hitPoints
     */
    public int getHitPoints();


    /**
     * Gets the maximum hit points of the object
     *
     * @return int maximum hit points
     */
    public int getMaxHitPoints();

    /**
     * Sets the hit points of the object
     *
     * @param hitPoints hit points of the object
     */
    public void setHitPoints(int hitPoints);

    /**
     * Set the maximum hit points of the object
     *
     * @param points hit points to set on the object
     */
    public void setMaxHitPoints(int points);

    /**
     * Returns true only if a object has more than 0 hit points
     *
     * @return boolean true if living
     */
    public boolean isAlive();

    /**
     * Handles an attack from an InfantryUnit
     *
     * @param soldier the attacker InfantryUnit
     */
    public void attackedByInfantryUnit(InfantryUnit soldier);

    /**
     * Handles an attack from an ArcherUnit
     *
     * @param archer the attacker ArcherUnit
     */
    public void attackedByArcherUnit(ArcherUnit archer);

    /**
     * Handles an attack from a CavalryUnit
     *
     * @param horseman the attacker CavalryUnit
     */
    public void attackedByCavalry(CavalryUnit horseman);

    /**
     * Handles an attack from a SiegeUnit
     *
     * @param bigWeapon the attacker SiegeUnit
     */
    public void attackedBySiegeUnit(SiegeUnit bigWeapon);

    /**
     * Handles an attack from a Monk
     *
     * @param priest the attacker Monk
     */
    public void attackedByMonk(Monk priest);

    /**
     * Handles an attack from a Villager
     *
     * @param peasant the attacker Villager
     */
    public void attackedByVillager(Villager peasant);

    /**
     * Handles an attack from a Castle
     *
     * @param fort the attacker Castle
     */
    public void attackedByCastle(Castle fort);
}
