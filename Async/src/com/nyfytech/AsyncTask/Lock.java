package com.nyfytech.AsyncTask;

public class Lock {
	private int RunningThreadNumber;
    private int threadsAvail;
    
	public Lock() {
	this.RunningThreadNumber = 0;
	this.threadsAvail = 0;
	}

	public int getRunningThread() {
	return RunningThreadNumber;
	}

	public void registerThread() {
	RunningThreadNumber++;
	threadsAvail++;	
	}
	
	public int runningThread() {
	return threadsAvail++;		
	}
	public void removeThread() {
	RunningThreadNumber--;
	}
}
