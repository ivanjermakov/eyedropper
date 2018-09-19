package com.gmail.ivanjermakov1.eyedropper;

import com.gmail.ivanjermakov1.eyedropper.clipboard.Clipboard;
import com.gmail.ivanjermakov1.eyedropper.image.PixelPicker;
import com.gmail.ivanjermakov1.eyedropper.image.RGBConverter;
import com.gmail.ivanjermakov1.eyedropper.screen.Screenshooter;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.mouse.NativeMouseEvent;

import java.awt.*;

public class MouseEventProcessor {
	
	public static void process(NativeMouseEvent nativeMouseEvent) {
		if (!(nativeMouseEvent.getButton() == NativeMouseEvent.BUTTON1 &&
				(nativeMouseEvent.getModifiers() & NativeKeyEvent.ALT_MASK) != 0)) return;
		
		try {
			String colorName = RGBConverter.toHexColor(PixelPicker.pick(Screenshooter.screenshot(), nativeMouseEvent.getPoint()));
			
			Clipboard.write(colorName);
			System.out.println("Color: " + colorName);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
}
