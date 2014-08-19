package dataSpace;

import java.io.File;

public abstract class FSObject {
	public long size;
	public File loc;
	
	public long getSize () {
		return this.size;
	}
	
	public abstract void printContainableSizes();
	public abstract void printContainableSizes(String dependenablePath);
}
