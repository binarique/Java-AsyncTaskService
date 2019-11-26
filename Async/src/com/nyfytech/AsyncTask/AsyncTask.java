package com.nyfytech.AsyncTask;

public class AsyncTask extends Thread {
	
private Thread t1 = null;
private Lock lock;
public AsyncTask() {
this.lock = new Lock();	
onPreExecute();	
}

public void publishProgress(int value){	
	
double doubleValue = (double)((value/100.0)*1);	

onProgress(doubleValue, value);	
}

public boolean isTasksRunning() {
if(lock.getRunningThread() > 0) {
return true;	
}else {
return false;	
}
}

public int runningTasks() {
return lock.runningThread();
}
@Override
public void run() {
lock.registerThread();

synchronized(lock) {
String results = doInBackground();	
onPostExecute(results);
}

lock.removeThread();
synchronized(lock) {
lock.notify();
}

while(lock.getRunningThread() > 0) {
synchronized(lock) {
try {
lock.wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}

}

public String doInBackground() {

return null;
}

public void onProgress(double value, int value2) {
	
}

public void onPreExecute() {
	
}

public void onPostExecute(String message) {
	
}

public void execute() {
t1 = new Thread(this);
if(t1 != null) {
t1.start();
try {
t1.join();
} catch (InterruptedException e) {}
}
}

}
