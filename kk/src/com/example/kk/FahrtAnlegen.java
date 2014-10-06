package com.example.kk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FahrtAnlegen extends Activity {

	Button btn_anlegen;
	Button btn_meinefahrten;
	Button btn_weiter;
	EditText startort;
	EditText zielort;
	
	void test (){
		
		btn_meinefahrten = (Button) findViewById(R.id.button2);
		btn_meinefahrten.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				startActivity(new Intent("com.example.kk.MEINE_FAHRTEN"));
			}
		});
		
		//Start - Orte eingeben
        btn_anlegen = (Button) findViewById(R.id.button1);
        btn_anlegen.setOnClickListener(new View.OnClickListener() {
        	       
            	@Override
    			public void onClick(View v) {
            		
            		File folder = new File(Environment.getExternalStorageDirectory(),"/Benutzerangaben");
            		File file = new File(folder,"history.txt");
            		
					try {
						FileWriter writer = new FileWriter(file,true);
						writer.append("dsdsadasd");
						writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

            		//Start - Toast - Bestätigung der Speicherung + Refresh
            		Toast toast = Toast.makeText(getApplicationContext(), " Fahrt wurde erfolgreich angelegt ", Toast.LENGTH_SHORT);
    				toast.show();
    				startActivity(new Intent("com.example.kk.FAHRT_ANLEGEN"));
    				//Ende - Toast - Bestätigung der Speicherung + Refresh
    			}
		});
        
        //Weiter-Button
        btn_weiter = (Button) findViewById(R.id.button3);
        btn_weiter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.example.kk.FAHRT_ANLEGEN_2"));
			}
		});
        // Ende - Orte eingeben	
      
	}
	

	// Methode legt einen Benutzerordner an, wenn noch nicht vorhanden
	void createFolder(){
		File folder = new File(Environment.getExternalStorageDirectory(),"/Benutzerangaben");
		if(!folder.exists()) {
			folder.mkdir();
		}		
	}
	
	
	// Methode legt einen Benutzerdatei an, wenn noch nicht vorhanden
	void createFile(){
		File folder = new File(Environment.getExternalStorageDirectory(),"/Benutzerangaben");
		File file = new File(folder, "history.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fahrt_anlegen);
	
		createFolder();
		createFile();
		test();			
	}
     		    
            

}
