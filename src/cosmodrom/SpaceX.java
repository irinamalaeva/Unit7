package cosmodrom;

import java.util.Random;

public class SpaceX implements IStart {

    @Override
    public boolean checkBeforeStart() {
        Random r = new Random();
        int number = r.nextInt(20);
        System.out.println(number);

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setEngineStart() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме");
    }

    @Override
    public void setStart() {
        System.out.println("Старт SpaceX");


    }
}
