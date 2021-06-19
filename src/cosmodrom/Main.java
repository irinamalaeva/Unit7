package cosmodrom;

public class Main {
    public static void main(String[] args) {

        Cosmodrom cosmodrom = new Cosmodrom();

        Shattle shattle = new Shattle();

        SpaceX spaceX = new SpaceX();

        cosmodrom.launch(shattle);
        cosmodrom.launch(spaceX);

    }
}
