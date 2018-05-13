public class Helicopter extends Vehicle  {


    public Helicopter(int health, String type, int attackValue) {
        super(health, type, attackValue);
    }


    public void gunAttack(Kaiju kaiju) {
        kaiju.attacked(10);
    }


    public void SpecialAttack(Kaiju kaiju) {
        kaiju.attacked(25);

    }



    public String move() {
        return "TTTT";
    }
}
