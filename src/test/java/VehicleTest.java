import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Tank tank;
    Helicopter helicopter;
    Category2 category2;
    Category4 category4;

    @Before
    public void before() {
        tank = new Tank(50, "Sherman", 10);
        helicopter = new Helicopter(100,"Lockheed", 10);
        category2 = new Category2("Ragnarok", 100, 20);
        category4 = new Category4("Leatherback", 100, 60);

    }

    @Test
    public void getTanksType(){
        assertEquals("Sherman", tank.getType());
    }

    @Test
    public void getHelicopterHealth() {
        assertEquals(100, helicopter.getHealth());
    }


    @Test
    public void testHelicopterAttacked() {
        category2.attack(helicopter);
        assertEquals(80, helicopter.getHealth());
    }
}




