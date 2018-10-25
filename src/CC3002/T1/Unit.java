package CC3002.T1;

/**
 * Represent an Unit in the game
 *
 * @author Fabiola Rivera
 */
public abstract class Unit extends AgeOfEmpiresObjects implements Attackable, Attacker {
    public int attackPoints;

    //Methods related to the condition attacker
    public abstract void attack(Attackable something);

    public int getAttackPoints() {
        return this.attackPoints;
    }

    //Methods related to the attacks of the types of buildings
    public abstract void attackedByCastle(Castle fort);

    //Methods related to the attacks of the types of units
    public abstract void attackedByInfantryUnit(InfantryUnit soldier);

    public abstract void attackedByArcherUnit(ArcherUnit archer);

    public abstract void attackedByCavalry(CavalryUnit horseman);

    public abstract void attackedBySiegeUnit(SiegeUnit bigWeapon);

    public abstract void attackedByMonk(Monk priest);

    public abstract void attackedByVillager(Villager peasant);
}
