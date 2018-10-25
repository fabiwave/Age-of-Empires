package test;

import CC3002.T1.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarracksTest {

    private ArcherUnit archer;
    private Barracks barrack;
    private Castle castle;
    private CavalryUnit cavalry;
    private InfantryUnit infantry;
    private Monk monk;
    private SiegeUnit siege;
    private Villager villager;

    @Before
    public void setUp() throws Exception {

        archer = new ArcherUnit();
        barrack = new Barracks();
        castle = new Castle();
        cavalry = new CavalryUnit();
        infantry = new InfantryUnit();
        monk = new Monk();
        siege = new SiegeUnit();
        villager = new Villager();
    }

    @Test
    public void attackedByInfantryUnit() {
        barrack.attackedByInfantryUnit(infantry);
        assertEquals(barrack.getHitPoints(), 348);
    }

    @Test
    public void attackedByArcherUnit() {
        barrack.attackedByArcherUnit(archer);
        assertEquals(barrack.getHitPoints(), 348);
    }

    @Test
    public void attackedByCavalry() {
        barrack.attackedByCavalry(cavalry);
        assertEquals(barrack.getHitPoints(), 348);
    }

    @Test
    public void attackedBySiegeUnit() {
        barrack.attackedBySiegeUnit(siege);
        assertEquals(barrack.getHitPoints(), 330);
    }

    @Test
    public void attackedByVillager() {
        barrack.attackedByVillager(villager);
        assertEquals(barrack.getHitPoints(), 350);
        barrack.setHitPoints(340);
        barrack.attackedByVillager(villager);
        assertEquals(barrack.getHitPoints(), 341);
    }

    @Test
    public void attackedByMonk() {
        barrack.attackedByMonk(monk);
        assertEquals(barrack.getHitPoints(), 350);
    }

    @Test
    public void attackedByCastle() {
        barrack.attackedByCastle(castle);
        assertEquals(barrack.getHitPoints(), 336);
    }
}