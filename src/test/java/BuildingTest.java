import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildingTest {


    Tank tank;
    Helicopter helicopter;
    Category2 category2;
    Category4 category4;
    Building building;

    @Before
    public void before() {
        tank = new Tank(50, "Sherman", 10);
        helicopter = new Helicopter(100,"Lockheed", 10);
        category2 = new Category2("Ragnarok", 100, 20);
        category4 = new Category4("Leatherback", 100, 60);
        building = new Building(100, "Chrystler", "Skyscraper");
    }

    @Test
    public void testBuildingCanBeAttacked() {
        category4.attack(building);
        assertEquals(40, building.getHealth());
    }

    @Test
    public void buildingsHealthReducedToZero() {
        category4.attack(building);
        category2.attack(building);
        category2.attack(building);
        category2.attack(building);
        category2.attack(building);
        assertEquals(0, building.getHealth());
    }
}
