package com.example.actionbarcustom1;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

@SuppressLint("NewApi")
public class MainActivity extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

			
		ActionBar actionbar = getActionBar();
		actionbar.setDisplayShowHomeEnabled(false);
		actionbar.setDisplayShowTitleEnabled(false);
		
		LayoutInflater inflater = LayoutInflater.from(this);
		
		View tampil = inflater.inflate(R.layout.custombar, null);
		TextView text = (TextView)tampil.findViewById(R.id.title_text);
		
		text.setText("Custome Bar");
		
		ImageButton gambar = (ImageButton)tampil.findViewById(R.id.imageButton);
		gambar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Refresh", Toast.LENGTH_LONG).show();
			}
		});
		
		actionbar.setCustomView(tampil);
		actionbar.setDisplayShowCustomEnabled(true);
	}

	
}
