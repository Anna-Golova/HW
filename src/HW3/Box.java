package HW3;

public class Box<T extends Fruit> {
    private final T fruit;
    private int currentItemsCount = 0;

    public Box(T fruit, int count) {
        this.fruit = fruit;
        currentItemsCount = count;
    }

    public void addFruits(int count) {
        currentItemsCount += count;
    }
    public float getWeight() {
        float weight = fruit.getFruitWeight();
        return weight * currentItemsCount;
    }

    public boolean compare(Box<? extends Fruit> ) {
        if (this.getWeight() == getWeight()) {
            return true;
        }
        return false;
    }
    public Box<T> unite(Box<T> srcBox) {
        currentItemsCount += srcBox.currentItemsCount;
        srcBox.currentItemsCount = 0;
        return this;
    }
}
