package org.cts;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SuitResul {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(C.class,D.class);
		int runcount = r.getRunCount();
		System.out.println(runcount);
		int ignoreCount = r.getIgnoreCount();
		System.out.println(ignoreCount);
		int failureCount = r.getFailureCount();
		System.out.println(failureCount);
		long runTime = r.getRunTime();
		System.out.println(runTime);
		System.out.println("Passed Counts"  +(runcount-failureCount));
		//to print the failure methods or test cases
	List<Failure> f = r.getFailures();	
	for (Failure x : f) {
		System.out.println(x);
	}
	boolean WasSuccesful = r.wasSuccessful();
	System.out.println(WasSuccesful);
	}}
		
	
