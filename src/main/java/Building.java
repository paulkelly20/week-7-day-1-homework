public class Building implements Attackable {

    private String name;
    private String type;
    private int health;

    public Building(int health, String name, String type) {
        this.health = health;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }


    public void attacked(int attackValue) {
        if(this.health > attackValue){
            this.health -= attackValue;}
        else this.health = 0;
    }
}

