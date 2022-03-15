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

    public String Move(String commands) {
        final String[] allDirections = {"S", "E", "N", "W"};
        System.out.println("\nMoving From X:" + x + " Y:" + y + " while looking at " + direction + "\n");
        for (int j = 0; j < commands.length(); j++) {
            if (commands.charAt(j) != 'l' && commands.charAt(j) != 'r' && commands.charAt(j) != 'f' && commands.charAt(j) != 'b') {
                throw new IllegalArgumentException("Illegal command inserted!");
            }
        }
        for (int i = 0; i < commands.length(); i++) {
            char ch = commands.charAt(i);
            if (ch == 'f') {
                if (direction == "N") {
                    if (y == 5) {
                        y = 1;
                    } else {
                        y = y + 1;
                    }
                }
                if (direction == "E") {
                    if (x == 5) {
                        x = 1;
                    } else {
                        x = x + 1;
                    }
                }
                if (direction == "S") {
                    if (y == 1) {
                        y = 5;
                    } else {
                        y = y - 1;
                    }
                }
                if (direction == "W") {
                    if (x == 1) {
                        x = 5;
                    } else {
                        x = x - 1;
                    }
                }
                System.out.println("Moving To X:" + x + " Y:" + y + "\n");
            }
            if (ch == 'b') {
                if (direction == "N") {
                    if (y == 1) {
                        y = 5;
                    } else {
                        y = y - 1;
                    }
                }
                if (direction == "E") {
                    if (x == 1) {
                        x = 5;
                    } else {
                        x = x - 1;
                    }
                }
                if (direction == "S") {
                    if (y == 5) {
                        y = 1;
                    } else {
                        y = y + 1;
                    }
                }
                if (direction == "W") {
                    if (x == 5) {
                        x = 1;
                    } else {
                        x = x + 1;
                    }
                }
                System.out.println("Moving To X:" + x + " Y:" + y + "\n");
            }
            if (ch == 'r') {
                for (int a = 0; a < 4; a++) {
                    if (direction == allDirections[a]) {
                        if (allDirections[a] == "S") {
                            direction = "W";
                        } else {
                            direction = allDirections[a - 1];
                        }
                        System.out.println("Rotating to " + direction);
                        a = 4;
                    }
                }
            }
            if (ch == 'l') {
                for (int b = 0; b < 4; b++) {
                    if (direction == allDirections[b]) {
                        if (allDirections[b] == "W") {
                            direction = "S";
                        } else {
                            direction = allDirections[b + 1];
                        }
                        System.out.println("Rotating to " + direction);
                        b = 4;
                    }
                }
            }
        }
        String position = String.format("%d:%d:%s", x, y, direction);
        System.out.println("Final position X:" + x + " Y:" + y + " while looking at " + direction);
        return position;
    }
}
    /*
    public int RoverRotate(char rotation) {
        if (rotation != 'L' && rotation != 'R') {
            throw new IllegalArgumentException("Only L,R rotations allowed");
        }
        final String[] allDirections = {"S", "E", "N", "W"};
        System.out.println("\nRotating from " + direction + "\n");
        if (rotation == 'L') {
            for (int i = 0; i < 4; i++) {
                if (direction == allDirections[i]) {
                    if (allDirections[i] == "S") {
                        direction = "W";
                        System.out.println("Rotating to " + direction);
                        return 0;
                    } else {
                        direction = allDirections[i-1];
                        System.out.println("Rotating to " + direction);
                        return 1;
                    }
                }
            }
        }
        if (rotation == 'R') {
            for (int i = 0; i < 4; i++) {
                if (direction == allDirections[i]) {
                    if (allDirections[i] == "W") {
                        direction = "S";
                        System.out.println("Rotating to " + direction);
                        return 0;
                    } else {
                        direction = allDirections[i+1];
                        System.out.println("Rotating to " + direction);
                        return 1;
                    }
                }
            }
        }
        return 1;
    }
}

    public int MoveForward(String commands) {
        System.out.println("\nMoving From X:" + x + " Y:" + y + "\n");
        for (int i = 0; i < commands.length(); i++) {
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
    */

