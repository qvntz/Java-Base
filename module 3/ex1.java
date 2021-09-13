public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) robot.turnLeft();
            } else {
                while (robot.getDirection() != Direction.RIGHT) robot.turnRight();
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) robot.turnLeft();
            } else {
                while (robot.getDirection() != Direction.UP) robot.turnRight();
            }
            robot.stepForward();
        }