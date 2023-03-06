package com.bl;

import java.util.Scanner;

public class Mood_Analyzer_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your mood:");
		String input = sc.nextLine();
		
		Mood_Analyzer mood = new Mood_Analyzer(input);
		System.out.println(mood.analyzeMood());
	}

}
