package com.nyfytech.AsyncTaskTest;
import com.nyfytech.AsyncTask.AsyncTask;

public class TestClass extends AsyncTask{
@Override
public String doInBackground(){
System.out.println("Task Running:" + runningTasks());
int i = 0;
while(i <= 100) {
publishProgress(i);	
try {
Thread.sleep(50);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}	
i++;
}
return "Everything is done";
}



@Override
public void onProgress(double value, int value2) {
System.out.println("progress:" + value2);
}

@Override
public void onPostExecute(String message) {
System.out.println("Progress Ended.... with message " + message);		
}

@Override
public void onPreExecute() {
System.out.println("Progress started....");	
}


}
