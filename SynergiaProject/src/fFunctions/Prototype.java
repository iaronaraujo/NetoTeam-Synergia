package fFunctions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import junit.framework.*;

public class Prototype {
	
	public final static String LINE_SEPARATOR = System.getProperty("line.separator");
	
	// change throws to try-catch-finally so we can close the file correctly
	public void getData(TestSuite ts) throws IOException{
		File file = new File("Test" + ts.getName());
		for(int i = 0; i < ts.testCount(); i++){
			calculateFaults(ts.testAt(i), file);
		}
		
		
	}
	
	//This tc may not be a test case, it could be a test suite
	private void calculateFaults(Test tc, File f) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		TestResult result = new TestResult();
		tc.run(result);
		StringBuffer tcInformation = new StringBuffer();
		tcInformation.append("Test Case: " + tc.toString() +
				" Error Amount:" + result.errorCount() +
				" Failure Amount:" + result.failureCount() + LINE_SEPARATOR);
		bw.write(tcInformation.toString());
	}
}
