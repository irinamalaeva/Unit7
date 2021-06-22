package by.teachmeskills.robot.legs;


public class SamsungLeg implements ILeg {

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    public void step() {
        System.out.println("Двигается нога Sumsung");
    }

    public int getPrice() {
        return price;
    }
}
