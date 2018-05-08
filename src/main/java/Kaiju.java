public abstract class Kaiju {
    private String name;
    private int healthvalue;
    private int attackvalue;


    public Kaiju(String name, int healthvalue, int attackvalue) {
        this.name = name;
        this.healthvalue = healthvalue;
        this.attackvalue = attackvalue;

    }

    public String getName() {
        return name;
    }

    public int getHealthvalue() {
        return healthvalue;
    }

    public int getAttackvalue() {
        return attackvalue;
    }

    public void setHealthvalue(int healthvalue) {
        this.healthvalue = healthvalue;
    }

    public String roar(){
        return "Roooar";
    }


}
