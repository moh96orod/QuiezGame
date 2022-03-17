package com.aide.android.quiz.game;

public class QuiezModal
{
	public static String question;
	public static String anwser;
	public static String option1;
	public static String option2;
	public static String option3;
	public static String option4;
	public static String tag;
	
	public QuiezModal(String question, String anwser, String option1, String option2, String option3, String option4, String tags) {
		this.question = question;
		this.anwser = anwser;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.tag = tags;
	}
	
	public static void setQuestion(String setquestions) {
		question = setquestions;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public static void setAnwser(String setanwser) {
		anwser = setanwser;
	}
	
	public String getAnwser() {
		return anwser;
	}
	
	public static void setOption1(String setop1) {
		option1 = setop1;
	}
	
	public String getOption1() {
		return option1;
	}
	
	public static void setOption2(String setop2) {
		option2 = setop2;
	}

	public String getOption2() {
		return option2;
	}
	
	public static void setOption3(String setop3) {
		option3 = setop3;
	}

	public String getOption3() {
		return option3;
	}
	
	public static void setOption4(String setop4) {
		option4 = setop4;
	}

	public String getOption4() {
		return option4;
	}
	
	public static void setTags(String title) {
		tag = title;
	}
	
	public static String getTags() {
		return tag;
	}
}
