package com.niit.scheduler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunMeTask {
	public void printMe() {
		System.out.println("Spring 3 + Quartz 1.8.6 ~");
		executeScript();
	}
	
	
	public void executeScript() {
		 try {
		             String target = new String("/root/testResultPrediction.sh");
		
		             Runtime rt = Runtime.getRuntime();
		             Process proc = rt.exec(target);
		             proc.waitFor();
		             StringBuffer output = new StringBuffer();
		             BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		             String line = "";                       
		             while ((line = reader.readLine())!= null) {
		                     output.append(line + "\n");
		             }
		             System.out.println("### " + output);
		     } catch (Throwable t) {
		             t.printStackTrace();
		     }
	}
	
}