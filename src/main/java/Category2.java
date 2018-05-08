public class Category2 extends Kaiju implements IBehaviours {

    public Category2(String name, int healthvalue, int attackvalue) {
        super(name, healthvalue, attackvalue);
    }


    public void attack(Vehicle vehicle) {
        int newHealthValue = 0;
        newHealthValue = (vehicle.getHealth() - this.getAttackvalue());
        vehicle.setHealth(newHealthValue);


    }

    public String move() {
        return "Moves at the speed of sound!";
    }
}
