package com.nyfytech.AsyncTaskTest;

public class Test {
public static void main(String[]args) {
	
for(int i = 0; i < 2; i++) {	

TestClass ts = new TestClass();
ts.execute();	
System.out.println("Running:" + ts.runningTasks());
}

}
}
