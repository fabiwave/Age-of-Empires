package test;

import CC3002.T1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CavalryUnitTest {

    private ArcherUnit archer;
    private Castle castle;
    private CavalryUnit cavalry;
    private CavalryUnit auxCavalry;
    private InfantryUnit infantry;
    private Monk monk;
    private SiegeUnit siege;
    private Villager villager;

    @Before
    public void setUp() throws Exception {

        archer = new ArcherUnit();
        castle = new Castle();
        cavalry = new CavalryUnit();
        auxCavalry = new CavalryUnit();
        infantry = new InfantryUnit();
        monk = new Monk();
        siege = new SiegeUnit();
        villager = new Villager();
    }

    @Test
    public void attack() {
        cavalry.attack(monk);
    }

    @Test
    public void attackedByInfantryUnit() {
        cavalry.attackedByInfantryUnit(infantry);
        assertEquals(cavalry.getHitPoints(), 56);
    }

    @Test
    public void attackedByArcherUnit() {
        cavalry.attackedByArcherUnit(archer);
        assertEquals(cavalry.getHitPoints(), 56);
    }

    @Test
    public void attackedByCavalry() {
        cavalry.attackedByCavalry(auxCavalry);
        assertEquals(cavalry.getHitPoints(), 57);
    }

    @Test
    public void attackedBySiegeUnit() {
        cavalry.attackedBySiegeUnit(siege);
        assertEquals(cavalry.getHitPoints(), 50);
    }

    @Test
    public void attackedByVillager() {
        cavalry.attackedByVillager(villager);
        assertEquals(cavalry.getHitPoints(), 59);
    }

    @Test
    public void attackedByMonk() {
        cavalry.attackedByMonk(monk);
        assertEquals(cavalry.getHitPoints(), 65);
    }

    @Test
    public void attackedByCastle() {
        cavalry.attackedByCastle(castle);
        assertEquals(cavalry.getHitPoints(), 36);
    }
}