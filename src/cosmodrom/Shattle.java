package cosmodrom;

import java.util.Random;

public class Shattle implements IStart {

    public boolean checkBeforeStart() {
        Random r = new Random();
        int number = r.nextInt(10);
        System.out.println(number);

        if (number > 3) {
            return true;
        } else {
            return false;
        }
    }

    public void setEngineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    public void setStart() {
        System.out.println("Старт Шатла");
    }
}