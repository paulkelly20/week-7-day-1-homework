public abstract class Vehicle {
    private String type;
    private int health;

    public Vehicle(String type, int health) {
        this.type = type;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
