public class Mage extends Unit {
    protected int mana;

    public Mage(int hp, String name, int mana) {
        super(hp, name);
        if (mana <= 0) {
            System.out.println("У вас нет маны");
        } else {
            this.mana = mana;
        }
    }


    public Mage(Unit a, Mage b) {
        super(a);
        this.mana = b.mana;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Маны" + ": " + mana);
    }

}
