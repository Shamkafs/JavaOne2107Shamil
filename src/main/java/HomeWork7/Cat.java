package HomeWork7;

public class Cat {

    private final String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if (this.appetite <= plate.getAmountOfFood()) {
            plate.decreaseAmountOfFood(this.appetite);
            this.satiety = true;
            this.appetite = 0;
        } else {
            this.satiety = false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}