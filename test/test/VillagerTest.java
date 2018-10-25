package test;

import CC3002.T1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VillagerTest {

    ArcherUnit archer;
    Barracks barrack;
    Castle castle;
    CavalryUnit cavalry;
    InfantryUnit infantry;
    Monk monk;
    SiegeUnit siege;
    Villager villager;
    Villager auxVillager;

    @Before
    public void setUp() throws Exception {
        archer = new ArcherUnit();
        barrack = new Barracks();
        castle = new Castle();
        cavalry = new CavalryUnit();
        infantry = new InfantryUnit();
        monk = new Monk();
        siege= new SiegeUnit();
        villager = new Villager();
        auxVillager = new Villager();
    }

    @Test
    public void attack() {
        villager.attack(monk);
    }

    @Test
    public void attackedByInfantryUnit() {
        villager.attackedByInfantryUnit(infantry);
        assertEquals(villager.getHitPoints(),14);
    }

    @Test
    public void attackedByArcherUnit() {
        villager.attackedByArcherUnit(archer);
        assertEquals(villager.getHitPoints(),14);
    }

    @Test
    public void attackedByCavalry() {
        villager.attackedByCavalry(cavalry);
        assertEquals(villager.getHitPoints(),16);
    }

    @Test
    public void attackedBySiegeUnit() {
        villager.attackedBySiegeUnit(siege);
        assertEquals(villager.getHitPoints(),5);
    }

    @Test
    public void attackedByVillager() {
        villager.attackedByVillager(auxVillager);
        assertEquals(villager.getHitPoints(),18);
    }

    @Test
    public void attackedByMonk() {
        villager.attackedByMonk(monk);
        assertEquals(villager.getHitPoints(),25);
    }

    @Test
    public void attackedByCastle() {
        villager.setHitPoints(30);
        villager.attackedByCastle(castle);
        assertEquals(villager.getHitPoints(),6);
    }
}