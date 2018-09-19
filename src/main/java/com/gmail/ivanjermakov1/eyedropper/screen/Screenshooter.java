package com.gmail.ivanjermakov1.eyedropper.screen;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Screenshooter {
	
	
	public static BufferedImage screenshot() throws AWTException {
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		return new Robot().createScreenCapture(screenRect);
	}
	
}
