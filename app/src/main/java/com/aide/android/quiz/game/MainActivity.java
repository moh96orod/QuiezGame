package com.aide.android.quiz.game;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		

		
		Button startQueiz = (Button) findViewById(R.id.startquiez);
		startQueiz.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View p1)
				{
					final Dialog dialogSetTags = new Dialog(MainActivity.this);
					dialogSetTags.setContentView(R.layout.set_tags);
					dialogSetTags.setTitle("Select Tag");
					
					Button programming = (Button) dialogSetTags.findViewById(R.id.settagsButton1);
					programming.setOnClickListener(new OnClickListener() {
						public void onClick(View v) {
							Intent i = new Intent(MainActivity.this, Quiez.class);
							i.putExtra("tag", "programming");
							startActivity(i);
							dialogSetTags.cancel();
						}
					});
					
					Button animal = (Button) dialogSetTags.findViewById(R.id.settagsButton2);
					animal.setOnClickListener(new OnClickListener() {
							public void onClick(View v) {
								Intent i = new Intent(MainActivity.this, Quiez.class);
								i.putExtra("tag", "animal");
								startActivity(i);
								dialogSetTags.cancel();
							}
						});
					
					
					dialogSetTags.show();
					
				}
		});
    }
}
