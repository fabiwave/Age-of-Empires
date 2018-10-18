package CC3002.T1;

public abstract class Unit implements Attackable,Attacker{
    private float hitPoints;
    public float maxHitPoints;

    //Methods related to the condition attackable
    public float getHitPoints() {
        return this.hitPoints;
    }
    public float getMaxHitPoints(){
        return this.maxHitPoints;
    }
    public void setHitPoints(float points){
        this.hitPoints = points;
    }
    public void setMaxHitPoints(){
        this.maxHitPoints= this.hitPoints;
    }
    public boolean isAlive(){
        if (this.hitPoints==0)
            return false;
        return true;
    }

    //Methods related to the condition attacker

    //Methods related to the types of buildings
    public abstract void attackedByCastle(Castle fort);
    public abstract void attackedByBarracks(Barracks hootch);

    //Methods related to the types of units
    public abstract void attackedByInfantryUnit(InfantryUnit soldier);
    public abstract void attackedByArcheryUnit(ArcherUnit archer);
    public abstract void attackedByCavalry(CavalryUnit horseman);
    public abstract void attackedBySiegeUnit(SiegeUnit bigWeapon);
    public abstract void attackedByMonk(Monk priest);
    public abstract void attackedByMonk(Villager peasant);
}
