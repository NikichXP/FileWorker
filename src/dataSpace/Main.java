package dataSpace;

import java.io.*;

public class Main {
	
	private static final String DIRECTORY_LOCATION = "A:\\Backup\\totalcmd";
	
	public static void main(String[] args) {
		
		
		FSObject fso = new FSDir(DIRECTORY_LOCATION);
		fso.printContainableSizes();

	}
}
