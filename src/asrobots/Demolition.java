package asrobots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

/**
 * Created by RENT on 2017-05-16.
 */
public class Demolition extends Robot {
    @Override
    public void run() {
        super.run();

        while (true) {

            ahead(300);
            turnLeft(320);
            turnRight(350);
            turnGunLeft(160);
            back(60);
            turnGunRight(250);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(2.6);
    }

    @Override
    public void setColors(Color bodyColor, Color gunColor, Color radarColor) {
        super.setColors(Color.blue, Color.green, Color.red);
    }
}
