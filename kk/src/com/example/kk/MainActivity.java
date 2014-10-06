package com.example.kk;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {

	Button btn_ok;
	Button btn_neuefahrt;
	EditText edit_name;	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        
        //Start - Fahrt anlegen - Verlinkung zu fahrt_anlegen.xml
        btn_neuefahrt = (Button) findViewById(R.id.button2);
        btn_neuefahrt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.example.kk.FAHRT_ANLEGEN"));
			}
		});
        
        // Ende - Fahrt anlegen
       
       

    }
}
