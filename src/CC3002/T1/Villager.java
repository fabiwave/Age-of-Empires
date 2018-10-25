package CC3002.T1;

/**
 * Creates a Villager
 *
 * @author Fabiola Rivera
 */
public class Villager extends Unit {

    /**
     * Constructor of the villager, all methods are defined in the parent class
     */

    public Villager() {
        this.hitPoints = 20;
        this.maxHitPoints = 2 * this.hitPoints;
        this.attackPoints = 2;
    }

    @Override
    public void attack(Attackable something) {
        something.attackedByVillager(this);
    }

    @Override
    public int getAttackPoints() {
        return super.getAttackPoints();
    }

    public void attackedByInfantryUnit(InfantryUnit soldier) {
        this.getHit(soldier.getAttackPoints(), (float) 1.5);
    }

    public void attackedByArcherUnit(ArcherUnit bowman) {
        this.getHit(bowman.getAttackPoints(), (float) 1.5);
    }

    public void attackedByCavalry(CavalryUnit horseman) {
        this.getHit(horseman.getAttackPoints(), (float) 1.5);
    }

    public void attackedBySiegeUnit(SiegeUnit bigWeapon) {
        this.getHit(bigWeapon.getAttackPoints(), (float) 1.5);
    }

    public void attackedByVillager(Villager peasant) {
        this.getHit(peasant.getAttackPoints(), (float) 1.0);
    }

    public void attackedByMonk(Monk priest) {
        this.getHeal(priest.getAttackPoints(), (float) 0.5);
    }

    public void attackedByCastle(Castle fort) {
        this.getHit(fort.getAttackPoints(), (float) 1.2);
    }
}