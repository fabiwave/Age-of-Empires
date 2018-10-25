package CC3002.T1;

public class SiegeUnit extends Unit {

    public SiegeUnit() {
        this.hitPoints = 140;
        this.maxHitPoints = 2 * this.hitPoints;
        this.attackPoints = 10;
    }

    @Override
    public void attack(Attackable something) {
        something.attackedBySiegeUnit(this);
    }

    @Override
    public int getAttackPoints() {
        return super.getAttackPoints();
    }

    public void attackedByInfantryUnit(InfantryUnit soldier) {
        this.getHit(soldier.getAttackPoints(), (float) 1.2);
    }

    public void attackedByArcherUnit(ArcherUnit bowman) {
        this.getHit(bowman.getAttackPoints(), (float) 0.8);
    }

    public void attackedByCavalry(CavalryUnit horseman) {
        this.getHit(horseman.getAttackPoints(), (float) 1.2);
    }

    public void attackedBySiegeUnit(SiegeUnit bigWeapon) {
        this.getHit(bigWeapon.getAttackPoints(), (float) 1.5);
    }

    public void attackedByVillager(Villager peasant) {
        this.getHeal(peasant.getAttackPoints(), (float) 0.5);
    }

    public void attackedByMonk(Monk priest) {
        ;
    }

    public void attackedByCastle(Castle fort) {
        this.getHit(fort.getAttackPoints(), (float) 0.5);
    }
}
