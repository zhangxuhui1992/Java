package com.study;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * @author zxh
 * @create 2020-01-08 14:34
 */
public class RobotTest {
    public static void main(String[] args) throws AWTException {
        Robot ro = new Robot();

        ro.delay(3000);
        ro.mousePress(InputEvent.BUTTON1_MASK);
        ro.mouseMove(-50,-50);
        ro.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}
