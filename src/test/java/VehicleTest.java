import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Tank tank;
    Helicopter helicopter;

    @Before
    public void before() {
        tank = new Tank(50, "Sherman", 10);
        helicopter = new Helicopter(100,"Lockheed", 10);

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
