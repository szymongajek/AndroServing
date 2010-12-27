package com.agapsoft.serving;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
 

public class Menu extends Activity {
	private EditText mTitleText;
	private EditText mBodyText;
 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.menu);

	    mTitleText = (EditText) findViewById(R.id.title);
	    mBodyText = (EditText) findViewById(R.id.body);

	    Button confirmButton = (Button) findViewById(R.id.confirm);

	     

	    confirmButton.setOnClickListener(new View.OnClickListener() {

	        public void onClick(View view) {
	            
	            finish();
	        }
	    });
	}
}
