package HomeWork6;

public class Animal {
    protected String name;
    protected int age;
    protected String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void run(int runDistance){
        if (runDistance > 0) {
            System.out.println(name + " пробежал " + runDistance + " м");
        } else {
            System.out.println("Дистанция не может быть отрицательной");
        }
    }

    public void swim(int swimDistance) {
        if (swimDistance > 0) {
            System.out.println(name + " проплыл " + swimDistance + " м");
        } else {
            System.out.println("Дистанция не может быть отрицательной");
        }
    }
}

