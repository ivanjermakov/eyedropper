package com.gmail.ivanjermakov1.eyedropper.image;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PixelPicker {
	
	public static int pick(BufferedImage image, Point pixel) {
		return image.getRGB(pixel.x, pixel.y);
	}
	
}
