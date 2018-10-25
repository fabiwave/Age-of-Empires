package CC3002.T1;

/**
 * Defines an object that can attack and its methods
 *
 * @author Fabiola Rivera
 */
public interface Attacker {
    /**
     * Attacks an attackable object
     * @param something object to attack
     */
    public void attack(Attackable something);

    /**
     * Returns the attack points of an object
     * @return Attack Points
     */
    public int getAttackPoints();
}
