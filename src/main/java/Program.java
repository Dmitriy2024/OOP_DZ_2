public class Program {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5, false);
        Cat cat2 = new Cat("Murzik", 5, false);
        Cat cat3 = new Cat("Pirat", 5, false);


        Plate plate = new Plate(10);
        plate.info();


        Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        for (Cat cat : cats) {
            cat.eat(plate.getFood());
            if ((cat.getSatite()) == true) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.println("Котик " + cat.getName() + ", поел и сыт.");
            } else {
                System.out.println("Котик " + cat.getName() + " голоден, в миске мало еды.");
            }
        }
    }
}

