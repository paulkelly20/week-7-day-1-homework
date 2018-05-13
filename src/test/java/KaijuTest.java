import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Category2 category2;
    Category4 category4;
    Tank tank;

    @Before
    public void before() {
        category2 = new Category2("Ragnarok", 100, 20);
        category4 = new Category4("Leatherback", 100, 60);
        tank = new Tank(100,"Sherman", 10);


    }

    @Test
    public void getKaijuName() {
        assertEquals("Ragnarok", category2.getName());
    }

    @Test
    public void getKaijuHealth() {
        assertEquals(100, category2.getHealthvalue());
    }

    @Test
    public void getKaijuAttackValue() {
        assertEquals(60, category4.getAttackvalue());
    }

    @Test
    public void kaijuAttacksTank(){
        category2.attack(tank);
        assertEquals(80, tank.getHealth());
    }


}
