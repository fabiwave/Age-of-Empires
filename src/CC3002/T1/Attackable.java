package CC3002.T1;

public interface Attackable {
    //Basics methods related to the entity
    public float getHitPoints();
    public float getMaxHitPoints();
    public void setHitPoints(float hitPoints);
    public void setMaxHitPoints();
    public boolean isAlive();

    //ATTACKS BY UNITS
    public void attackedByInfantryUnit(InfantryUnit soldier);
    public void attackedByArcheryUnit(ArcherUnit archer);
    public void attackedByCavalry(CavalryUnit horseman);
    public void attackedBySiegeUnit(SiegeUnit bigWeapon);
    public void attackedByMonk(Monk priest);
    public void attackedByMonk(Villager peasant);

    //ATTACKS BY BUILIDINGS
    public void attackedByCastle(Castle fort);
    public void attackedByBarracks(Barracks hootch);
}
