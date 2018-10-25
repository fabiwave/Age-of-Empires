package CC3002.T1;

public interface Attackable {
    //Basics methods related to the entity
    public int getHitPoints();

    public int getMaxHitPoints();

    public void setHitPoints(int hitPoints);

    public void setMaxHitPoints(int points);

    public boolean isAlive();

    //ATTACKS BY UNITS
    public void attackedByInfantryUnit(InfantryUnit soldier);

    public void attackedByArcherUnit(ArcherUnit archer);

    public void attackedByCavalry(CavalryUnit horseman);

    public void attackedBySiegeUnit(SiegeUnit bigWeapon);

    public void attackedByMonk(Monk priest);

    public void attackedByVillager(Villager peasant);

    //ATTACKS BY BUILDINGS
    public void attackedByCastle(Castle fort);
}
