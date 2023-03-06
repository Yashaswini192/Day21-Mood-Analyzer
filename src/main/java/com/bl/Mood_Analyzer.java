package com.bl;

public class Mood_Analyzer {
	static String message;

	//Refactor code 
	public Mood_Analyzer() {

	}

	public Mood_Analyzer(String message) { //parameterized constructor
		super();
		this.message = message;
	}


	public String analyzeMood() {
		try {
			if(message.length() == 0) {
				this.message = null;
			}
		if(message.contains("sad")) {
			return "sad";
		}else {
			return "Happy";
		}	
	}catch(NullPointerException e){
		
		return "Happy";
	}
}
}