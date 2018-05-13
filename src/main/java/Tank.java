public class Tank extends Vehicle{

    public Tank(int health, String type, int attackValue) {
        super(health, type, attackValue);
    }


    public void gunAttack(Kaiju kaiju) {
        kaiju.attacked(15);
    }


    public void SpecialAttack(Kaiju kaiju) {
        kaiju.attacked(35);
    }
}
