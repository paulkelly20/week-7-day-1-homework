public class Category4 extends Kaiju implements IBehaviours{

    public Category4(String name, int healthvalue, int attackvalue) {
        super(name, healthvalue, attackvalue);
    }





    public void attack(Vehicle vehicle) {
        int newHealthValue = 0;
        if(vehicle.getHealth() > 50){
            newHealthValue = (vehicle.getHealth() - this.getAttackvalue());
            vehicle.setHealth(newHealthValue);}
        else vehicle.setHealth(0);

    }


    public String move() {
        return "Moves like a tornado";
    }
}
