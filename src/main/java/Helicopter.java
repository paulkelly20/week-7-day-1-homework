public class Helicopter extends Vehicle implements IAttacks {


    public Helicopter(String type, int health) {
        super(type, health);

    }

    @Override
    public void gunAttack(Kaiju kaiju) {
        int newHealthValue = 0;
        newHealthValue = (kaiju.getHealthvalue() - 10);
        kaiju.setHealthvalue(newHealthValue);


    }


    public void SpecialAttack(Kaiju kaiju) {
        int newHealthValue = 0;
        newHealthValue = (kaiju.getHealthvalue() - 25);
        kaiju.setHealthvalue(newHealthValue);

    }
}
