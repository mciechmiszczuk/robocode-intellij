package asrobots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * Created by RENT on 2017-05-16.
 */
public class SleepingDog extends Robot {
    @Override
    public void run() {
        super.run();

        while (true) {

            ahead(500);
            turnLeft(100);
            turnRight(250);
            turnGunLeft(60);
            back(100);
            turnGunRight(250);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1.4);
    }
}