package com.niit.scheduler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunMeTask {
	public void printMe() {
		System.out.println("Execute Query for Prediction");
		executeScript();
	}
	
	
	public void executeScript() {
		
		 try {
	            Process proc = Runtime.getRuntime().exec("/root/testResultPrediction.sh"); //Whatever you want to execute
	            BufferedReader read = new BufferedReader(new InputStreamReader(proc.getInputStream()));
	                   
	            try {
	                proc.waitFor();
	            } catch (InterruptedException e) {
	                System.out.println(e.getMessage());
	            }
	            while (read.ready()) {
	                System.out.println(read.readLine());
	            }
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
		 
	}
	
}
