public class Dressing {
    public static void main(String[] args) {

JacketChina jacketChina = new JacketChina();
JacketRussia jacketRussia = new JacketRussia();
JacketFrance jacketFrance = new JacketFrance();

PantsChina pantsChina = new PantsChina();
PantsRussia pantsRussia = new PantsRussia();
PantsFrance pantsFrance = new PantsFrance();

ShoesChina shoesChina = new ShoesChina();
ShoesRussia shoesRussia = new ShoesRussia();
ShoesFrance shoesFrance = new ShoesFrance();

Human human1 = new Human("Vasia",jacketChina, pantsRussia, shoesFrance);
Human human2 = new Human("kolia",jacketRussia, pantsFrance, shoesChina);
Human human3 = new Human("Petia",jacketFrance, pantsChina, shoesRussia);

human1.putOn();
human2.putOn();
human3.putOn();

human1.takeOff();
human2.takeOff();
human3.takeOff();


    }
}
