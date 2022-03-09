public class MarsRover {
    public int x;
    public int y;
    public String direction;

    public MarsRover(int x, int y, String direction) {
        if (x > 0 && x < 6 && y > 0 && y < 6) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException("Only numbers between 0-6 allowed");
        }

        if (direction == "N" || direction == "E" || direction == "S" || direction == "W") {
            this.direction = direction;
        } else {
            throw new IllegalArgumentException("Only N,E,S,W directions allowed");
        }
    }

    public int MoveForward() {
        System.out.println("\nMoving From X:" + x + " Y:" + y + "\n");
        if (direction == "N") {
            if (y == 5) {
                y = 1;
                System.out.println("Moving To X:" + x + " Y:" + y);
                return 0;
            }
            else {
                y = y + 1;
                System.out.println("Moving To X:" + x + " Y:" + y);
                return 1;
            }
        }
        if (direction == "E") {
            if (x == 5) {
                x = 1;
                System.out.println("Moving To X:" + x + " Y:" + y);
                return 0;
            }
            else {
                x = x + 1;
                System.out.println("Moving To X:" + x + " Y:" + y);
                return 1;
            }
        }
        if (direction == "S") {
            if (y == 1) {
                y = 5;
                System.out.println("Moving To X:" + x + " Y:" + y);
                return 0;
            }
            else {
                y = y - 1;
                System.out.println("Moving To X:" + x + " Y:" + y);
                return 1;
            }
        }
        if (direction == "W") {
            if (x == 1) {
                x = 5;
                System.out.println("Moving To X:" + x + " Y:" + y);
                return 0;
            }
            else {
                x = x - 1;
                System.out.println("Moving To X:" + x + " Y:" + y);
                return 1;
            }
        }
        return 1;
    }
}
