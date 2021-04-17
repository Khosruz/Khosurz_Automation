package com.analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyzer implements IRetryAnalyzer{
	
	int counter = 0;
	int retryLimit = 2;
	
	
	public boolean retry(ITestResult result) {
		System.out.println("for git update");
		System.out.println("for git update2");
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		return false;
	}

	 
	
}
