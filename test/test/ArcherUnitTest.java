package test;

import CC3002.T1.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArcherUnitTest {

    ArcherUnit auxArcher;
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
            auxArcher = new ArcherUnit();
            archer = new ArcherUnit();
            barrack = new Barracks();
            castle = new Castle();
            cavalry = new CavalryUnit();
            infantry = new InfantryUnit();
            monk = new Monk();
            siege= new SiegeUnit();
            villager = new Villager();
    }

    @Test
    public void attack() {
        archer.attack(monk);
        // attack() tests are redundant, all attackedByArcherUnit are tested in their classes
        /* archer.attack(barrack);
        onk.attack(castle);
        archer.attack(cavalry);
        archer.attack(infantry);
        archer.attack(monk);
        archer.attack(siege);
        archer.attack(villager); */
    }

    @Test
    public void getAttackPoints() {
        assertEquals(archer.getAttackPoints(),4);
    }

    @Test
    public void attackedByInfantryUnit() {
        archer.attackedByInfantryUnit(infantry);
        assertEquals(archer.getHitPoints(),26);
}

    @Test
    public void attackedByArcherUnit() {
        archer.attackedByArcherUnit(auxArcher);
        assertEquals(archer.getHitPoints(),26);
    }

    @Test
    public void attackedByCavalry() {
        archer.attackedByCavalry(cavalry);
        assertEquals(archer.getHitPoints(),26);
    }

    @Test
    public void attackedBySiegeUnit() {
        archer.attackedBySiegeUnit(siege);
        assertEquals(archer.getHitPoints(),15);
    }

    @Test
    public void attackedByVillager() {
        archer.attackedByVillager(villager);
        assertEquals(archer.getHitPoints(),28);
    }

    @Test
    public void attackedByMonk() {
        archer.attackedByMonk(monk);
        assertEquals(archer.getHitPoints(),35);
    }

    @Test
    public void attackedByCastle() {
        archer.attackedByCastle(castle);
        assertEquals(archer.getHitPoints(),6);
    }
}