package test;

import CC3002.T1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CastleTest {

    ArcherUnit archer;
    Barracks barrack;
    Castle castle;
    Castle auxCastle;
    CavalryUnit cavalry;
    InfantryUnit infantry;
    Monk monk;
    SiegeUnit siege;
    Villager villager;

    @Before
    public void setUp() throws Exception {

        archer = new ArcherUnit();
        barrack = new Barracks();
        castle = new Castle();
        auxCastle = new Castle();
        cavalry = new CavalryUnit();
        infantry = new InfantryUnit();
        monk = new Monk();
        siege= new SiegeUnit();
        villager = new Villager();
    }

    @Test
    public void attack() {
        castle.attack(monk);
    }


    @Test
    public void getAttackPoints() {
        assertEquals(castle.getAttackPoints(),20);
    }

    @Test
    public void attackedByInfantryUnit() {
        castle.attackedByInfantryUnit(infantry);
        assertEquals(castle.getHitPoints(),4799);
    }

    @Test
    public void attackedByArcherUnit() {
        castle.attackedByArcherUnit(archer);
        assertEquals(castle.getHitPoints(),4800);
    }

    @Test
    public void attackedByCavalry() {
        castle.attackedByCavalry(cavalry);
        assertEquals(castle.getHitPoints(),4800);
    }

    @Test
    public void attackedBySiegeUnit() {
        castle.attackedBySiegeUnit(siege);
        assertEquals(castle.getHitPoints(),4780);
    }

    @Test
    public void attackedByVillager() {
        castle.attackedByVillager(villager);
        assertEquals(castle.getHitPoints(),4800);
        castle.setHitPoints(3000);
        castle.attackedByVillager(villager);
        assertEquals(castle.getHitPoints(),3000);
    }

    @Test
    public void attackedByMonk() {
        castle.attackedByMonk(monk);
        assertEquals(castle.getHitPoints(),4800);
    }

    @Test
    public void attackedByCastle() {
        castle.attackedByCastle(auxCastle);
        assertEquals(castle.getHitPoints(),4798);
    }
}