package HomeWork7;

public class App {
    public static void main(String[] args) {

        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Boris", 20, false);
        cat[1] = new Cat("Murzik", 25, false);
        cat[2] = new Cat("Barsik", 40, false);
        cat[3] = new Cat("Murka", 30, false);
        Plate plate = new Plate (50);

        for (int i = 0; i < cat.length; i++) {
            plate.increaseAmountOfFood(cat[i]);//Добавляем еду, если не хватает для сытости
            cat[i].eat(plate);//Просим массив котов покушать из тарелки
        }
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
        }
        System.out.println(plate);
    }
}
