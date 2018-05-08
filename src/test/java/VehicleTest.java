import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Tank tank;
    Helicopter helicopter;

    @Before
    public void before() {
        tank = new Tank("Sherman", 50);
        helicopter = new Helicopter("Lockheed", 100);

    }

    @Test
    public void getTanksType(){
        assertEquals("Sherman", tank.getType());
    }

    @Test
    public void getHelicopterHealth() {
        assertEquals(100, helicopter.getHealth());
    }
}
