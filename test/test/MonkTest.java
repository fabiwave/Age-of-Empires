package test;

import CC3002.T1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MonkTest {

    Monk auxMonk;
    ArcherUnit archer;
    Barracks barrack;
    Castle castle;
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
        cavalry = new CavalryUnit();
        infantry = new InfantryUnit();
        auxMonk = new Monk();
        monk = new Monk();
        siege= new SiegeUnit();
        villager = new Villager();

    }

    @Test
    public void attack() {
        monk.attack(archer);
        assertTrue(true);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(monk.getAttackPoints(),10);
    }

    @Test
    public void attackedByInfantryUnit() {
        monk.attackedByInfantryUnit(infantry);
        assertEquals(monk.getHitPoints(),0);
        assertFalse(monk.isAlive());
    }

    @Test
    public void attackedByArcherUnit() {
        monk.attackedByArcherUnit(archer);
        assertEquals(monk.getHitPoints(),0);
        assertFalse(monk.isAlive());
    }

    @Test
    public void attackedByCavalry() {
        monk.attackedByCavalry(cavalry);
        assertEquals(monk.getHitPoints(),0);
        assertFalse(monk.isAlive());
    }

    @Test
    public void attackedBySiegeUnit() {
        monk.attackedBySiegeUnit(siege);
        assertEquals(monk.getHitPoints(),0);
        assertFalse(monk.isAlive());
    }

    @Test
    public void attackedByVillager() {
        monk.attackedByVillager(villager);
        assertEquals(monk.getHitPoints(),30);
        assertTrue(monk.isAlive());
    }

    @Test
    public void attackedByMonk() {
        monk.attackedByMonk(auxMonk);
        assertEquals(monk.getHitPoints(),35);
        assertTrue(monk.isAlive());
    }

    @Test
    public void attackedByCastle() {
        monk.attackedByCastle(castle);
        assertEquals(monk.getHitPoints(),0);
        assertFalse(monk.isAlive());
    }

    @Test
    public void getHitPoints() {

        assertEquals(monk.getHitPoints(),monk.hitPoints);
    }

    @Test
    public void getMaxHitPoints() {
        assertEquals(monk.getMaxHitPoints(),monk.maxHitPoints);
    }

    @Test
    public void setHitPoints() {
        monk.setHitPoints(10);
        assertEquals(monk.getHitPoints(),10);
    }

    @Test
    public void setMaxHitPoints() {
        monk.setMaxHitPoints(50);
        assertEquals(monk.getMaxHitPoints(),50);
    }

    @Test
    public void isAlive() {
        assertTrue(monk.isAlive());
        monk.setHitPoints(0);
        assertFalse(monk.isAlive());

    }

    @Test
    public void getHit() {
        monk.getHit(10,(float) 1.5);
        assertEquals(monk.getHitPoints(),15);
        monk.getHit(20,2);
        assertEquals(monk.getHitPoints(),0);
        assertFalse(monk.isAlive());
    }

    @Test
    public void getHeal() {
        monk.getHeal(10,1);
        assertEquals(monk.getHitPoints(),40);
        monk.getHeal(50,1);
        assertEquals(monk.getHitPoints(), 60);
    }
}