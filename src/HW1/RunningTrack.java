package HW1;

public class RunningTrack implements Obstacles {
    int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "Дорожка длиной" + length + "м";
    }
}
