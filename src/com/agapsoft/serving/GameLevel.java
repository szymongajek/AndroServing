package com.agapsoft.serving;

import com.agapsoft.serving.R;
import com.agapsoft.serving.core.LevelEngine;

import android.app.Activity;
import android.os.Bundle;
 
 

public class GameLevel extends LevelEngine {
	 
 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.game_level);

	   
	}
}
