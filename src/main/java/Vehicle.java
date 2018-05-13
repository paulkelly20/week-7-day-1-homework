public abstract class Vehicle implements Attackable, IAttacks {
    private int health;
    private String type;
    private int attackValue;

    public Vehicle(int health, String type, int attackValue) {
        this.health = health;
        this.type = type;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackValue() {
        return attackValue;
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
