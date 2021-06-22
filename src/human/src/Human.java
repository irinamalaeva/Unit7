public class Human implements IHuman {
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;
    private String name;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
        this.name = name;
    }

    public Human() {
    }

    public IJacket getJacket() {
        return jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public String getName() {
        return name;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void putOn() {
        System.out.println("Одевается " + name);
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
        System.out.println();
    }

    public void takeOff() {
        System.out.println("Раздевается " + name);
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
        System.out.println();

    }

}
