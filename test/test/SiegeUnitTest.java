package test;

import CC3002.T1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SiegeUnitTest {

    private ArcherUnit archer;
    private Castle castle;
    private CavalryUnit cavalry;
    private InfantryUnit infantry;
    private Monk monk;
    private SiegeUnit siege;
    private SiegeUnit auxSiege;
    private Villager villager;


    @Before
    public void setUp() throws Exception {

        archer = new ArcherUnit();
        castle = new Castle();
        cavalry = new CavalryUnit();
        infantry = new InfantryUnit();
        monk = new Monk();
        siege = new SiegeUnit();
        auxSiege = new SiegeUnit();
        villager = new Villager();
    }

    @Test
    public void attack() {
        siege.attack(monk);
    }

    @Test
    public void attackedByInfantryUnit() {
        siege.attackedByInfantryUnit(infantry);
        assertEquals(siege.getHitPoints(), 136);
    }

    @Test
    public void attackedByArcherUnit() {
        siege.attackedByArcherUnit(archer);
        assertEquals(siege.getHitPoints(), 137);
    }

    @Test
    public void attackedByCavalry() {
        siege.attackedByCavalry(cavalry);
        assertEquals(siege.getHitPoints(), 137);
    }

    @Test
    public void attackedBySiegeUnit() {
        siege.attackedBySiegeUnit(auxSiege);
        assertEquals(siege.getHitPoints(), 125);
    }

    @Test
    public void attackedByVillager() {
        siege.attackedByVillager(villager);
        assertEquals(siege.getHitPoints(), 141);
    }

    @Test
    public void attackedByMonk() {
        siege.attackedByMonk(monk);
        assertEquals(siege.getHitPoints(), 140);
    }

    @Test
    public void attackedByCastle() {
        siege.attackedByCastle(castle);
        assertEquals(siege.getHitPoints(), 130);
    }
}