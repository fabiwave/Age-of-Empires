package CC3002.T1;

public class Barracks extends Building {

    public Barracks() {
        this.hitPoints = 350;
        this.maxHitPoints = hitPoints;
    }

    public void attackedByInfantryUnit(InfantryUnit soldier) {
        this.getHit(soldier.getAttackPoints(), (float) 0.7);
    }

    public void attackedByArcherUnit(ArcherUnit bowman) {
        this.getHit(bowman.getAttackPoints(), (float) 0.7);
    }

    public void attackedByCavalry(CavalryUnit horseman) {
        this.getHit(horseman.getAttackPoints(), (float) 0.7);
    }

    public void attackedBySiegeUnit(SiegeUnit bigWeapon) {
        this.getHit(bigWeapon.getAttackPoints(), (float) 2.0);
    }

    public void attackedByVillager(Villager peasant) {
        getHeal(peasant.getAttackPoints(), (float) 0.7);
    }

    public void attackedByMonk(Monk priest) {
        ;
    }

    public void attackedByCastle(Castle fort) {
        this.getHit(fort.getAttackPoints(), (float) 0.7);
    }
}