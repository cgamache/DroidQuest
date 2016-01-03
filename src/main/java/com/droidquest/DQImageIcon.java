package com.droidquest;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class DQImageIcon extends ImageIcon {

	
	public DQImageIcon(String fileName) {
		super(DQImageIcon.class.getResource(fileName));
	}

	public DQImageIcon() {
		super();
	}

	public DQImageIcon(byte[] imageData, String description) {
		super(imageData, description);
	}

	public DQImageIcon(byte[] imageData) {
		super(imageData);
	}

	public DQImageIcon(Image image, String description) {
		super(image, description);
	}

	public DQImageIcon(Image image) {
		super(image);
	}

	public DQImageIcon(String filename, String description) {
		super(DQImageIcon.class.getResource(filename), description);
	}

	public DQImageIcon(URL location, String description) {
		super(location, description);
	}

	public DQImageIcon(URL location) {
		super(location);
	}
	
	
	
}
