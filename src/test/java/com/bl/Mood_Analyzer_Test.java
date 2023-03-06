package com.bl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Mood_Analyzer_Test {

	@Test
	public void check_MoodAnalyzer_to_Return_Sad() {
		Mood_Analyzer analyser = new Mood_Analyzer("sad");
		
		assertEquals("sad", analyser.analyzeMood());
	}
	@Test
	public void check_MoodAnalyzer_to_Return_happy() {
		Mood_Analyzer analyser = new Mood_Analyzer("Happy");
		
		assertEquals("Happy", analyser.analyzeMood());
	}
	
	
	
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
