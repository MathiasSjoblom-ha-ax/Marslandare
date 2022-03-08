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

        if (direction == "N" || direction == "W" || direction == "S" || direction == "E") {
            this.direction = direction;
        } else {
            throw new IllegalArgumentException("Only N,W,S,E directions allowed");
        }
    }
}
