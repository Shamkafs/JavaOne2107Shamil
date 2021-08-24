package HomeWork6;

class Cat extends Animal {

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void run(int runDistance) {
        int maxRunDistance = 200;
        if ((runDistance > 0) && (runDistance <= 200)) {
            System.out.println(name + " пробежал " + runDistance + " м");
        } else if (runDistance > maxRunDistance){
            System.out.println(name + " пробежал максимальную дистанцию: " + maxRunDistance + " м");
        } else {
            System.out.println("Дистанция у " + name + " не может быть отрицательной");
        }
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println(name + " не умеет плавать");
    }
}
