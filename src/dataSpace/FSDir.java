package dataSpace;
import java.io.*;


public class FSDir extends FSObject {
	public File loc;
	public FSObject [] dir;
	public String [] cats;
	public long size;
	
	public FSDir (String path) {
		loc = new File (path);
		dir = new FSObject [loc.listFiles().length];
		cats = new String [dir.length];
		this.size = 0;
		for (int i = 0; i < dir.length; i++) {
			if (loc.listFiles()[i].isFile()) {
				dir[i] = new FSFile(loc.listFiles()[i].getAbsolutePath());
			} else {
				dir[i] = new FSDir(loc.listFiles()[i].getPath());
			}
			this.size += dir[i].getSize();
			cats[i] = new String (loc.listFiles()[i].getAbsolutePath().substring( /* Тут сабстринг */
					this.loc.getAbsolutePath().length(),
					this.loc.listFiles()[i].getAbsolutePath().length())
				);
			System.out.println(cats[i]);
		}
	}
	
	public void printContainableSizes() {
		for (FSObject obj : dir) {
			System.out.println(obj.size + " size: "  + obj.location.getPath() );
		}
	}
	public void printContainableSizes(String dependenablePath) {
		
		//Данный метод существует для демонстрации полиморфизма.
		
		for (FSObject obj : dir) {
			System.out.println(obj.size + " size: "  + obj.location.getAbsolutePath() );
		}
	}
	
	public long getSize () {
		return this.size;
	}
}