package com.aide.android.quiz.game;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Quiez extends Activity
{
	
	public static QuiezModal model;
	public static HashMap<String, String> dataQueation, dataAnwser;
	public static int score = 0;
	public static TextView textScore;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_queiz);
		
		
		Bundle getData = getIntent().getExtras();
		String getTag = getData.getString("tag");
		
		if(getTag.contains("programming")) {
			// Score
			textScore = (TextView) findViewById(R.id.startqueizTextView2);
			textScore.setText(String.valueOf(score));
			
			// Create a HashMap for save question
			dataQueation = new HashMap<>();
			dataQueation.put("question1", "What Is Python?");
			dataQueation.put("question2", "What Is Django?");
			dataQueation.put("question3", "What Is Cat?");

			// Create a HashMap for save anwser
			dataAnwser = new HashMap<>();
			dataAnwser.put("anwser1", "Programming Language");
			dataAnwser.put("anwser2", "FreamWork");
			dataAnwser.put("anwser3", "a little freamwork");

			Set<String> keySet = dataQueation.keySet();
			ArrayList<String> keyList = new ArrayList<>(keySet);

			int size = keyList.size();
			int randIDX = new Random().nextInt(size);

			String randomKey = keyList.get(randIDX);
			String randomValue = dataQueation.get(randomKey);


			if(randomValue == "What Is Python?") {
				model = new QuiezModal(randomValue, dataAnwser.get("anwser1"), "Animal", "Car", "Programming Language", "App", "Programming");
			}

			else if(randomValue == "What Is Django?") {
				model = new QuiezModal(randomValue, dataAnwser.get("anwser2"), "Car", "SoftWare", "Book", "FreamWork", "Programming");
			}

			else if(randomValue == "What Is Flask?") {
				model = new QuiezModal(randomValue, dataAnwser.get("anwser3"), "an Animal", "Car", "a little freamwork", "SoftWare", "Animal");
			}


			TextView question = (TextView) findViewById(R.id.startqueizTextView1);
			question.setText(model.getQuestion());

			final String anwser = model.getAnwser();

			final Button op1 = (Button) findViewById(R.id.startqueizButton1);
			final Button op2 = (Button) findViewById(R.id.startqueizButton2);
			final Button op3 = (Button) findViewById(R.id.startqueizButton3);
			final Button op4 = (Button) findViewById(R.id.startqueizButton4);

			op1.setText(model.getOption1());
			op2.setText(model.getOption2());
			op3.setText(model.getOption3());
			op4.setText(model.getOption4());

			op1.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						if(op1.getText() == anwser) {
							Toast.makeText(getApplicationContext(), "Your Anwser is True!", Toast.LENGTH_SHORT).show();
							op1.setBackgroundColor(Color.GREEN);
							
							score += 1;
							textScore.setText(String.valueOf(score));
							
							Intent nextQuestion = new Intent(Quiez.this, Quiez.class);
							nextQuestion.putExtra("tag", "programming");
							startActivity(nextQuestion);
							
							finish();
							
						}
						else {
							op1.setBackgroundColor(Color.RED);
							op1.setEnabled(false);
							op2.setEnabled(false);
							op3.setEnabled(false);
							op4.setEnabled(false);
						}
					}
				});

			op2.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						if(op2.getText() == anwser) {
							Toast.makeText(getApplicationContext(), "Your Anwser is True!", Toast.LENGTH_SHORT).show();
							op2.setBackgroundColor(Color.GREEN);
							
							score += 1;
							textScore.setText(String.valueOf(score));
							
							Intent nextQuestion = new Intent(Quiez.this, Quiez.class);
							nextQuestion.putExtra("tag", "programming");
							startActivity(nextQuestion);
							
							finish();
						}
						else {
							op2.setBackgroundColor(Color.RED);
							op1.setEnabled(false);
							op2.setEnabled(false);
							op3.setEnabled(false);
							op4.setEnabled(false);
						}
					}
				});

			op3.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						if(op3.getText() == anwser) {
							Toast.makeText(getApplicationContext(), "Your Anwser is True!", Toast.LENGTH_SHORT).show();
							op3.setBackgroundColor(Color.GREEN);
							
							score += 1;
							textScore.setText(String.valueOf(score));
							
							Intent nextQuestion = new Intent(Quiez.this, Quiez.class);
							nextQuestion.putExtra("tag", "programming");
							startActivity(nextQuestion);
							
							finish();
						}
						else {
							op3.setBackgroundColor(Color.RED);
							op1.setEnabled(false);
							op2.setEnabled(false);
							op3.setEnabled(false);
							op4.setEnabled(false);
						}
					}
				});

			op4.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						if(op4.getText() == anwser) {
							Toast.makeText(getApplicationContext(), "Your Anwser is True!", Toast.LENGTH_SHORT).show();
							op4.setBackgroundColor(Color.GREEN);
							
							score += 1;
							textScore.setText(String.valueOf(score));
							
							Intent nextQuestion = new Intent(Quiez.this, Quiez.class);
							nextQuestion.putExtra("tag", "programming");
							startActivity(nextQuestion);
							
							finish();
						}
						else {
							op4.setBackgroundColor(Color.RED);
							op1.setEnabled(false);
							op2.setEnabled(false);
							op3.setEnabled(false);
							op4.setEnabled(false);
						}
					}
				});
				
			
		}
		
		else if(getTag.contains("animal")) {
			// Score
			textScore = (TextView) findViewById(R.id.startqueizTextView2);
			textScore.setText(String.valueOf(score));
			
			// Create a HashMap for save question
			dataQueation = new HashMap<>();
			dataQueation.put("question1", "What eat cat?");
			dataQueation.put("question2", "What eat sheep?");
			dataQueation.put("question3", "What eat dog?");

			// Create a HashMap for save anwser
			dataAnwser = new HashMap<>();
			dataAnwser.put("anwser1", "meat");
			dataAnwser.put("anwser2", "plant");
			dataAnwser.put("anwser3", "meat");

			Set<String> keySet = dataQueation.keySet();
			ArrayList<String> keyList = new ArrayList<>(keySet);

			int size = keyList.size();
			int randIDX = new Random().nextInt(size);

			String randomKey = keyList.get(randIDX);
			String randomValue = dataQueation.get(randomKey);


			if(randomValue == "What eat cat?") {
				model = new QuiezModal(randomValue, dataAnwser.get("anwser1"), "rice", "meat", "plant", "food", "Programming");
			}

			else if(randomValue == "What eat sheep?") {
				model = new QuiezModal(randomValue, dataAnwser.get("anwser2"), "rice", "meat", "plant", "food", "Programming");
			}

			else if(randomValue == "What eat dog?") {
				model = new QuiezModal(randomValue, dataAnwser.get("anwser3"), "rice", "meat", "plant", "food", "Animal");
			}


			TextView question = (TextView) findViewById(R.id.startqueizTextView1);
			question.setText(model.getQuestion());

			final String anwser = model.getAnwser();

			final Button op1 = (Button) findViewById(R.id.startqueizButton1);
			final Button op2 = (Button) findViewById(R.id.startqueizButton2);
			final Button op3 = (Button) findViewById(R.id.startqueizButton3);
			final Button op4 = (Button) findViewById(R.id.startqueizButton4);

			op1.setText(model.getOption1());
			op2.setText(model.getOption2());
			op3.setText(model.getOption3());
			op4.setText(model.getOption4());

			op1.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						if(op1.getText() == anwser) {
							Toast.makeText(getApplicationContext(), "Your Anwser is True!", Toast.LENGTH_SHORT).show();
							op1.setBackgroundColor(Color.GREEN);
							
							score += 1;
							textScore.setText(String.valueOf(score));
							
							Intent nextQuestion = new Intent(Quiez.this, Quiez.class);
							nextQuestion.putExtra("tag", "animal");
							startActivity(nextQuestion);
							
							finish();
						}
						else {
							op1.setBackgroundColor(Color.RED);
							op1.setEnabled(false);
							op2.setEnabled(false);
							op3.setEnabled(false);
							op4.setEnabled(false);
						}
					}
				});

			op2.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						if(op2.getText() == anwser) {
							Toast.makeText(getApplicationContext(), "Your Anwser is True!", Toast.LENGTH_SHORT).show();
							op2.setBackgroundColor(Color.GREEN);
							
							score += 1;
							textScore.setText(String.valueOf(score));
							
							Intent nextQuestion = new Intent(Quiez.this, Quiez.class);
							nextQuestion.putExtra("tag", "animal");
							startActivity(nextQuestion);
							
							finish();
						}
						else {
							op2.setBackgroundColor(Color.RED);
							op1.setEnabled(false);
							op2.setEnabled(false);
							op3.setEnabled(false);
							op4.setEnabled(false);
						}
					}
				});

			op3.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						if(op3.getText() == anwser) {
							Toast.makeText(getApplicationContext(), "Your Anwser is True!", Toast.LENGTH_SHORT).show();
							op3.setBackgroundColor(Color.GREEN);
							
							score += 1;
							textScore.setText(String.valueOf(score));
							
							Intent nextQuestion = new Intent(Quiez.this, Quiez.class);
							nextQuestion.putExtra("tag", "animal");
							startActivity(nextQuestion);
							
							finish();
						}
						else {
							op3.setBackgroundColor(Color.RED);
							op1.setEnabled(false);
							op2.setEnabled(false);
							op3.setEnabled(false);
							op4.setEnabled(false);
						}
					}
				});

			op4.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						if(op4.getText() == anwser) {
							Toast.makeText(getApplicationContext(), "Your Anwser is True!", Toast.LENGTH_SHORT).show();
							op4.setBackgroundColor(Color.GREEN);
							
							score += 1;
							textScore.setText(String.valueOf(score));
							
							Intent nextQuestion = new Intent(Quiez.this, Quiez.class);
							nextQuestion.putExtra("tag", "animal");
							startActivity(nextQuestion);
							
							finish();
							
						}
						else {
							op4.setBackgroundColor(Color.RED);
							op1.setEnabled(false);
							op2.setEnabled(false);
							op3.setEnabled(false);
							op4.setEnabled(false);
						}
					}
				});
		}
	}
	
	
}
