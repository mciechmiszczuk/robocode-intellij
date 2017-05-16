package asrobots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

/**
 * Created by RENT on 2017-05-16.
 */
public class Killswitch extends Robot {
    @Override
    public void run() {
        super.run();

        while (true) {

            ahead(700);
            turnLeft(90);
            turnRight(400);
            turnGunLeft(320);
            back(80);
            turnGunRight(160);
        }
    }

    @Override
    public void setBodyColor(Color color) {
        super.setBodyColor(Color.red);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(0.8);
    }
}
