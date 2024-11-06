package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TorpedoStoreTest {


    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void ship_ALL_success(){
        GT4500 ship = new GT4500(10,0,10,0);
        boolean result = ship.fireTorpedo(FiringMode.ALL);
        assertTrue(result);
    } 

    @Test
    void ship_ALL_fail(){
        GT4500 ship = new GT4500(10,1,0,1);
        boolean result = ship.fireTorpedo(FiringMode.ALL);
        assertFalse(result);
    }

    @Test
    void ship_ALL_fail2(){
        GT4500 ship = new GT4500(0,0,0,0);
        boolean result = ship.fireTorpedo(FiringMode.ALL);
        assertFalse(result);
    }

    @Test
    void ship_SINGLE_success1(){
        GT4500 ship = new GT4500(10,0,10,0);
        boolean result = ship.fireTorpedo(FiringMode.SINGLE);
        assertTrue(result);
    }

    @Test
    void ship_SINGLE_success2(){
        GT4500 ship = new GT4500(0,0,10,0);
        boolean result = ship.fireTorpedo(FiringMode.SINGLE);
        assertTrue(result);
    }

    @Test
    void ship_SINGLE_failiure1(){
        GT4500 ship = new GT4500(10,1,10,0);
        boolean result = ship.fireTorpedo(FiringMode.SINGLE);
        assertFalse(result);
    }

    @Test
    void ship_SINGLE_failiure2(){
        GT4500 ship = new GT4500(10,0,10,1);
        boolean result = ship.fireTorpedo(FiringMode.SINGLE);
        assertTrue(result);
    }

    @Test
    void ship_SINGLE_failiure3(){
        GT4500 ship = new GT4500(0,0,10,1);
        boolean result = ship.fireTorpedo(FiringMode.SINGLE);
        assertFalse(result);
    }
}
