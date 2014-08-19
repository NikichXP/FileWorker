package dataSpace;

import java.io.File;

public class FSFile extends FSObject {

	public FSFile(String absolutePath) {
		this.location = new File (absolutePath);
		this.size = this.location.length(); 
	}
	
	@Override
	public void printContainableSizes() {
		System.out.println(this.location.getAbsolutePath() + "  size: " + this.location.length());
	}
	
	@Override
	public void printContainableSizes(String dependablePath) {
		System.out.println("'" + this.location + dependablePath + ": no such file or directory!");
	}

}
