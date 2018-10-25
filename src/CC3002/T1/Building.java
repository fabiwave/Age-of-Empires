package CC3002.T1;

/**
 * Represents a Building in the game
 *
 * @author Fabiola Rivera
 */

public abstract class Building extends AgeOfEmpiresObjects implements Attackable {

    //Methods related to the types of buildings
    public abstract void attackedByCastle(Castle fort);

    //Methods related to the types of units
    public abstract void attackedByInfantryUnit(InfantryUnit soldier);

    public abstract void attackedByArcherUnit(ArcherUnit bowman);

    public abstract void attackedByCavalry(CavalryUnit horseman);

    public abstract void attackedBySiegeUnit(SiegeUnit bigWeapon);

    public abstract void attackedByMonk(Monk priest);
}
