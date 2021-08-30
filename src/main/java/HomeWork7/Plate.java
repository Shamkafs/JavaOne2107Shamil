package HomeWork7;

public class Plate {

    private int amountOfFood;

    public Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void decreaseAmountOfFood(int amount) {
        this.amountOfFood -= amount;
    }

    public void increaseAmountOfFood(Cat cat){
        if (amountOfFood < cat.getAppetite()) {
            this.amountOfFood += 50;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "amountOfFood=" + amountOfFood +
                '}';
    }
}
