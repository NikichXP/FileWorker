package dataSpace;

import java.io.File;

public class FSFile extends FSObject {

	public FSFile(String absolutePath) {
		this.loc = new File (absolutePath);
		this.size = this.loc.length(); 
//		System.out.println(this.loc + " size: " + this.size);
	}
	
	@Override
	public void printContainableSizes() {
		System.out.println(this.loc.getAbsolutePath() + "  size: " + this.loc.length());
	}
	
	@Override
	public void printContainableSizes(String dependablePath) {
		System.out.println("'" + this.loc + dependablePath + ": no such file or directory!");
	}

}
