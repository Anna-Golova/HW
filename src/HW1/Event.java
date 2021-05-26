package HW1;

public class Event {
    public static void main(String[] args) {
        Party[] members = {
                new Cat(1, 2, "Fluffy"),
                new Human(2, 4, "Dima"),
                new Robot(1, 3, "ВАЛЛ-И")
        };

        Obstacles[] obstacles = {
                new RunningTrack(5),
                new Wall(4)
        };

        for (Party member : members) {
            System.out.println("К прохождению приступает" + member);
            boolean winner = true;
            for (Obstacles obstacles1 : obstacles) {
                System.out.println(member + "пытается пройти" + obstacles1);
                if (obstacles1.toJump(member.getMaxHeight()) ||
                obstacles1.toRun(member.getMaxLength())) {
                    System.out.println("Успешно");
                } else {
                    winner = false;
                    System.out.println("Успешно");
                }
            }
            if(winner) {
                System.out.println(member + "");
            } else {
                System.out.println(member + "");
            }
            System.out.println();
        }
    }
}
