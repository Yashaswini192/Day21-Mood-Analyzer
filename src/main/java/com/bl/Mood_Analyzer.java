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
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Message canot be empty");
			}
		if(message.contains("sad")) {
			return "sad";
		}else {
			return "Happy";
		}	
	}catch(NullPointerException e){
		
		throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Message canot be null");
	}
}
}