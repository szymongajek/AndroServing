package com.agapsoft.serving;
 


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * dfsfdsfrf
 * 
 */
public class Game extends Activity {
	
	private GameLevel gameLevel;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        findViewById(R.id.start_game).setOnClickListener(
                new OnClickListener() {
            public void onClick(View v) {
                startGame(true);
            }
        });
        findViewById(R.id.show_menu).setOnClickListener(
                new OnClickListener() {
            public void onClick(View v) {
            	showMenu();
            }
        });
        
    }

    private void showMenu( ) {
    	Intent i = new Intent(this, Menu.class);
    	startActivityForResult(i, 0);
    }
    private void startGame(boolean param) {
    	Intent i = new Intent(this, GameLevel.class);
    	startActivityForResult(i, 0);
   
    }
    
    
}