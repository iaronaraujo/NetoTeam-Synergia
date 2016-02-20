package fFunctions;

import java.io.IOException;

import junit.framework.TestSuite;
import randoop.RandoopTest0;

public class Main {

	public static void main(String[] args) throws IOException {
		Prototype prototype = new Prototype();
		
		TestSuite result = new TestSuite();
	    result.addTest(new TestSuite(RandoopTest0.class));
	    prototype.getData(result);
	    System.out.println("OK!");

	}

}
