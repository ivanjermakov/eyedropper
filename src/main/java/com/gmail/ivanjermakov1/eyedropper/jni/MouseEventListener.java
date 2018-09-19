package com.gmail.ivanjermakov1.eyedropper.jni;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

public interface MouseEventListener extends NativeMouseInputListener {
	
	@Override
	default void nativeMouseClicked(NativeMouseEvent nativeMouseEvent) {
	}
	
	@Override
	default void nativeMousePressed(NativeMouseEvent nativeMouseEvent) {
	}
	
	@Override
	default void nativeMouseReleased(NativeMouseEvent nativeMouseEvent) {
	}
	
	@Override
	default void nativeMouseMoved(NativeMouseEvent nativeMouseEvent) {
	}
	
	@Override
	default void nativeMouseDragged(NativeMouseEvent nativeMouseEvent) {
	}
	
}
