package com.gmail.ivanjermakov1.eyedropper.jni;

import com.gmail.ivanjermakov1.eyedropper.MouseEventProcessor;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.mouse.NativeMouseEvent;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MouseEventListenerImpl implements MouseEventListener {
	
	@Override
	public void nativeMouseClicked(NativeMouseEvent nativeMouseEvent) {
		MouseEventProcessor.process(nativeMouseEvent);
	}
	
	public static void init() throws NativeHookException {
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		logger.setUseParentHandlers(false);
		
		GlobalScreen.registerNativeHook();
		
		GlobalScreen.addNativeMouseListener(new MouseEventListenerImpl());
	}
	
}
