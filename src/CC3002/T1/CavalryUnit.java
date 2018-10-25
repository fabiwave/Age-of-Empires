package CC3002.T1;

public class CavalryUnit extends Unit {

    public CavalryUnit() {
        this.hitPoints = 60;
        this.maxHitPoints = 2 * this.hitPoints;
        this.attackPoints = 3;
    }

    @Override
    public void attack(Attackable something) {
        something.attackedByCavalry(this);
    }

    @Override
    public int getAttackPoints() {
        return super.getAttackPoints();
    }

    public void attackedByInfantryUnit(InfantryUnit soldier) {
        this.getHit(soldier.getAttackPoints(), (float) 1.2);
    }

    public void attackedByArcherUnit(ArcherUnit bowman) {
        this.getHit(bowman.getAttackPoints(), (float) 1.0);
    }

    public void attackedByCavalry(CavalryUnit horseman) {
        this.getHit(horseman.getAttackPoints(), (float) 1.0);
    }

    public void attackedBySiegeUnit(SiegeUnit bigWeapon) {
        this.getHit(bigWeapon.getAttackPoints(), (float) 1.0);
    }

    public void attackedByVillager(Villager peasant) {
        this.getHit(peasant.getAttackPoints(), (float) 0.5);
    }

    public void attackedByMonk(Monk priest) {
        this.getHeal(priest.getAttackPoints(), (float) 0.5);
    }

    public void attackedByCastle(Castle fort) {
        this.getHit(fort.getAttackPoints(), (float) 1.2);
    }

}