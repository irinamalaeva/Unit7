public class ShoesChina implements IShoes{
    public ShoesChina(){

    }

    @Override
    public void putOn() {
        System.out.println("Надеть туфли China");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять туфли China");

    }
}
