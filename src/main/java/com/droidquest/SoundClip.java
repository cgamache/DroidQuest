package com.droidquest;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class SoundClip {
    public AudioClip audioClip;

    public SoundClip(String f) {
        URL soundURL = this.getClass().getResource("sounds/" + f);
        if (soundURL == null) {
        	audioClip = null;
        } else {
        	audioClip = Applet.newAudioClip(soundURL);
        }
    }
}
