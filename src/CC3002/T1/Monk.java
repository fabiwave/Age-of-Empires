package CC3002.T1;

public class Monk extends Unit {

    public Monk() {
        this.hitPoints = 30;
        this.maxHitPoints = (2 * this.hitPoints);
        this.attackPoints = 10;
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
        this.setHitPoints(0);
    }

    public void attackedByArcherUnit(ArcherUnit bowman) {
        this.setHitPoints(0);
    }

    public void attackedByCavalry(CavalryUnit horseman) {
        this.setHitPoints(0);
    }

    public void attackedBySiegeUnit(SiegeUnit bigWeapon) {
        this.setHitPoints(0);
    }

    public void attackedByVillager(Villager peasant) {
        ;
    }

    public void attackedByMonk(Monk priest) {
        this.getHeal(priest.getAttackPoints(), (float) 0.5);
    }

    public void attackedByCastle(Castle fort) {
        this.setHitPoints(0);
    }

}