package com.gmail.ivanjermakov1.eyedropper.image;

public class RGBConverter {
	
	public static String toHexColor(int rgb) {
		return String.format("#%06X", (0xFFFFFF & rgb));
	}
	
}
