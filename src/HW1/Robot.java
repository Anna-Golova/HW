package HW1;

public class Robot implements Party {
    String name;
    int maxHeight;
    int maxLength;

    public Robot(int maxLength, int maxHeight, String name) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.name = name;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Robot jump");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Robot run");
    }

    @Override
    public String toString() {
        return "Робот по имени" + name;
    }
}
