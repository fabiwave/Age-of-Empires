package CC3002.T1;

public class Castle extends Building implements Attacker{

    @Override
    public void attack(Attackable something) {
        if (this.isAlive()){
            something.attackedByCastle(this);
        }
    }

    @Override
    public float getAttackPoints() {
        return 0;
    }

    //Attacked by other Buildings
    public void attackedByCastle(Castle fort){
        this.getHit(fort.getAttackPoints(),(float)0.1);
    }

    //Attacked by Units
    public void attackedByInfantryUnit(InfantryUnit soldier){
        this.getHit(soldier.getAttackPoints(), (float) 0.3);
    }
    public void attackedByArcherUnit(ArcherUnit bowman){
        this.getHit(bowman.getAttackPoints(), (float) 0.1);
    }
    public void attackedByCavalry(CavalryUnit horseman){
        this.getHit(horseman.getAttackPoints(), (float) 0.3);
    }
    public void attackedBySiegeUnit(SiegeUnit bigWeapon){
        this.getHit(bigWeapon.getAttackPoints(),(float) 2.0);
    }
    public void attackedByMonk(Monk priest){
        ;
    }
    public void attackedByVillager(Villager peasant) {
        this.getHeal(peasant.getAttackPoints(),(float)0.3);
    }

}
