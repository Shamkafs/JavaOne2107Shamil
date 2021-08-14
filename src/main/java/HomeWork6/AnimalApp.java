package HomeWork6;

public class AnimalApp {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, "grey");
        cat.run(150);
        cat.swim(150);
        Cat cat2 = new Cat("Murzik", 7, "white");
        cat2.run(250);
        cat2.swim(200);
        Cat cat3 = new Cat("Chicha", 10, "brown");
        cat3.run(-100);
        cat3.swim(-150);
        Dog dog = new Dog("Sharik", 3, "black");
        dog.run(400);
        dog.swim(5);
        Dog dog2 = new Dog("Reks", 8, "dark-brown");
        dog2.run(1000);
        dog2.swim(25);
        Dog dog3 = new Dog("Stepa", 8, "light-brown");
        dog3.run(-200);
        dog3.swim(-5);
    }
}
