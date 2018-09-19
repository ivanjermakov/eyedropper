package com.gmail.ivanjermakov1.eyedropper.clipboard;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class Clipboard {
	
	public static void write(String text) {
		StringSelection stringSelection = new StringSelection(text);
		java.awt.datatransfer.Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}
	
}
