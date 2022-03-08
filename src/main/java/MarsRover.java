public class MarsRover {
    public int x;
    public int y;
    public String direction;

    public MarsRover(int x, int y, String direction) {
        if (direction == "N" || direction == "W" || direction == "S" || direction == "E") {
            this.x = x;
            this.y = y;
            this.direction = direction;
        } else {
            throw new IllegalArgumentException("Only N,W,S,E directions allowed");
        }
    }
}
