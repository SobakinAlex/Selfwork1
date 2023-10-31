public class Unit {
    protected int hp;
    protected String name;

    public Unit(int hp, String name){
        if (hp <= 0){
            System.out.println("У вас нет hp");
        } else {
            this.hp = hp;
        }
        this.name = name;
    }
    public void printInfo() {
        System.out.println("Имя" + ": " + name);
        System.out.println("Здоровье" + ": " + hp);
    }
}
