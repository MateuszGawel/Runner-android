package com.apptogo.runner.android;

import android.os.Bundle;

import com.apptogo.runner.main.Runner;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		config.useAccelerometer = false;
        config.useCompass = false;
		initialize(new Runner(), config);
		
		//tu bylem
	}
}
