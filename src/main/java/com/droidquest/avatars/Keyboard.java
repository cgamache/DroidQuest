package com.droidquest.avatars;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Keyboard {

	public static final int SHORTCUT_MODIFIER = Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask();
	
    public static boolean isControlDown(KeyEvent e) {
    	return (e.getModifiers() & SHORTCUT_MODIFIER) > 0;
    }

	
}
