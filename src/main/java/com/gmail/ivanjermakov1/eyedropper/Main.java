package com.gmail.ivanjermakov1.eyedropper;

import com.gmail.ivanjermakov1.eyedropper.jni.MouseEventListenerImpl;
import org.jnativehook.NativeHookException;

public class Main {
	
	public static void main(String[] args) throws NativeHookException {
		MouseEventListenerImpl.init();
	}
	
}
