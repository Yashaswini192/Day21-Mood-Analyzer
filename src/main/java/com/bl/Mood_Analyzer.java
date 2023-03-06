package com.bl;

public class Mood_Analyzer {
	static String message;

	public Mood_Analyzer() {

	}

	public Mood_Analyzer(String message) {
		super();
		this.message = message;
	}


	public String analyzeMood() {
		if(message.contains("sad")) {
			return "sad";
		}else {
			return "Happy";
		}	
	}

}
