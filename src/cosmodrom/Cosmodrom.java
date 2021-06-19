package cosmodrom;

public class Cosmodrom {

    public void launch(IStart istart) {

        if (!istart.checkBeforeStart()) {

            System.out.println("Предстартовая проверка провалена" + "\n");
        } else {
            System.out.println("Предстартовая проверка прошла успешно");
            istart.setEngineStart();
            istart.setStart();
        }
    }
}
