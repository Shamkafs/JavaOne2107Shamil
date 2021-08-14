package HomeWork6;

class Dog extends Animal {

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void run(int runDistance) {
        int maxRunDistance = 500;
        if ((runDistance > 0) && (runDistance <= maxRunDistance)) {
            System.out.println(name + " пробежал " + runDistance + " м");
        } else if (runDistance > maxRunDistance){
            System.out.println(name + " пробежал максимальную дистанцию: " + maxRunDistance + " м");
        } else {
            System.out.println("Дистанция у " + name + " не может быть отрицательной");
        }
    }

    @Override
    public void swim(int swimDistance) {
        int maxSwimDistance = 10;
        if ((swimDistance > 0) && (swimDistance <= maxSwimDistance)) {
            System.out.println(name + " проплыл " + swimDistance + " м");
        } else if (swimDistance > maxSwimDistance){
            System.out.println(name + " проплыл максимальную дистанцию: " + maxSwimDistance + " м");
        } else {
            System.out.println("Дистанция у " + name + " не может быть отрицательной");
        }
    }
}