package com.example.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Processor {
	
	public String runProcess(String command){
		ProcessBuilder process = new ProcessBuilder(command);
		
		String str;
		String result = "";
		try{
			process.directory();
			Process shell = process.start();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(shell.getInputStream()));
			
			while((str = reader.readLine()) != null){
				result += str + "<br/>";
			}
		}catch(Exception ex){}
		
		return result;
	}
	
	
}
