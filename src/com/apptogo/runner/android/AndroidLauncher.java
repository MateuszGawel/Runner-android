package com.apptogo.runner.android;

import android.os.Bundle;

import com.apptogo.runner.main.Runner;
import com.apptogo.runner.vars.Box2DVars;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Box2DVars.ZOOM_CAMERA_IN_REGISTER_SCREEN = true;
		
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.useAccelerometer = false;
        config.useCompass = false;
		initialize(new Runner(), config);
		
		//tu bylem
	}
}
