package CC3002.T1;

public class Monk extends Unit {

    public Monk() {
        this.hitPoints = 30;
        this.maxHitPoints = (2 * this.hitPoints);
        this.attackPoints = 15;
    }

    @Override
    public void attack(Attackable something) {
        something.attackedByMonk(this);
    }

    @Override
    public int getAttackPoints() {
        return super.getAttackPoints();
    }

    public void attackedByInfantryUnit(InfantryUnit soldier) {
        this.getHit(soldier.getAttackPoints(), (float) 100000.0);
    }

    public void attackedByArcherUnit(ArcherUnit bowman) {
        this.getHit(bowman.getAttackPoints(), (float) 100000.0);
    }

    public void attackedByCavalry(CavalryUnit horseman) {
        this.getHit(horseman.getAttackPoints(), (float) 100000.0);
    }

    public void attackedBySiegeUnit(SiegeUnit bigWeapon) {
        this.getHit(bigWeapon.getAttackPoints(), (float) 100000.0);
    }

    public void attackedByVillager(Villager peasant) {
        ;
    }

    public void attackedByMonk(Monk priest) {
        this.getHeal(priest.getAttackPoints(), (float) 0.5);
    }

    public void attackedByCastle(Castle fort) {
        this.getHit(fort.getAttackPoints(), (float) 100000.0);
    }

}