public abstract class Kaiju implements IBehaviours, Attackable {
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


    public void attacked(int attackValue) {
        this.healthvalue -= attackValue;
    }

    public int getHealthvalue() {
        return healthvalue;
    }

    public int getAttackvalue() {
        return attackvalue;
    }


    public String roar(){
        return "Roooar";
    }

    public void attack(Attackable attackable){
        attackable.attacked(this.attackvalue);
    }

}
