public class ShoesFrance implements IShoes{
    public ShoesFrance(){

    }

    @Override
    public void putOn() {
        System.out.println("Надеть туфли France");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять туфли France");

    }
}
