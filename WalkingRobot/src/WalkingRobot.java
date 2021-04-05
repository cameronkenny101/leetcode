public class WalkingRobot {

    public static void main(String[] args) {
        int[] commands = {-2, -1, -2, 3, 7};
        int[][] obstacles = {{0, 0}};
        System.out.println(robotSim(commands, obstacles));
    }

    enum Direction {NORTH, SOUTH, EAST, WEST};

    private static int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0;
        Direction robot = Direction.NORTH;

        for (int command : commands) {
            if (command == -2)
                robot = moveLeft(robot);
            else if (command == -1)
                robot = moveRight(robot);
            else {
                if (robot.equals(Direction.NORTH)) {
                    int minY = Integer.MAX_VALUE;
                    for (int[] obstacle : obstacles) {
                        if (x == obstacle[0]) {
                            if (obstacle[1] >= y && obstacle[1] <= y + command)
                                minY = Math.min(obstacle[1], minY);
                        }
                    }
                    y = Math.min(y + command, minY - 1);
                } else if (robot.equals(Direction.SOUTH)) {
                    int maxY = Integer.MIN_VALUE;
                    for (int[] obstacle : obstacles) {
                        if (x == obstacle[0]) {
                            if (obstacle[1] <= y && obstacle[1] >= y - command)
                                maxY = Math.max(obstacle[1], maxY);
                        }
                    }
                    y = Math.max(y - command, maxY + 1);
                } else if(robot.equals(Direction.EAST)) {
                    int minX = Integer.MAX_VALUE;
                    for (int[] obstacle : obstacles) {
                        if (y == obstacle[1]) {
                            if (obstacle[0] >= x && obstacle[0] <= x + command)
                                minX = Math.min(obstacle[0], minX);
                        }
                    }
                    x = Math.min(x + command, minX - 1);
                } else {
                    int maxX = Integer.MIN_VALUE;
                    for (int[] obstacle : obstacles) {
                        if (y == obstacle[1]) {
                            if (obstacle[0] <= x && obstacle[0] >= x - command)
                                maxX = Math.max(obstacle[0], maxX);
                        }
                    }
                    x = Math.max(x - command, maxX + 1);
                }
            }

        }

        return (int) (Math.pow(x, 2) + Math.pow(y, 2));
    }

    private static Direction moveLeft(Direction robot) {
        if(robot.equals(Direction.NORTH))
            robot = Direction.WEST;
        else if(robot.equals(Direction.WEST))
            robot = Direction.SOUTH;
        else if(robot.equals(Direction.SOUTH))
            robot = Direction.EAST;
        else
            robot = Direction.NORTH;

        return robot;
    }

    private static Direction moveRight(Direction robot) {
        if(robot.equals(Direction.NORTH))
            robot = Direction.EAST;
        else if(robot.equals(Direction.WEST))
            robot = Direction.NORTH;
        else if(robot.equals(Direction.SOUTH))
            robot = Direction.WEST;
        else
            robot = Direction.SOUTH;

        return robot;
    }
}
