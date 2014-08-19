package dataSpace;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		String analyzableLocation = "A:\\Backup\\totalcmd";
//		File analyzableDirectoryPath = new File (analyzableLocation);
		FSObject fso = new FSDir(analyzableLocation);
		fso.printContainableSizes();
//		FSObject [] analyzableDirectorySubpaths = new FSObject [analyzableDirectoryPath.listFiles().length]; //Теперь у нас есть небольшой фрагмент
//		for (int i = 0; i < analyzableDirectorySubpaths.length; i++) {
//			if (analyzableDirectoryPath.listFiles()[i].isFile()) {
//				analyzableDirectorySubpaths[i] = new FSFile(analyzableDirectoryPath.listFiles()[i].getAbsolutePath());
//			}
//			else {
//				analyzableDirectorySubpaths[i] = new FSDir(analyzableDirectoryPath.listFiles()[i].getAbsolutePath());
//			}
//			System.out.println(analyzableDirectoryPath.listFiles()[i].getAbsolutePath());
//			System.out.println("obj: "+ analyzableDirectoryPath.listFiles()[i].getAbsolutePath() + "    size:" + analyzableDirectorySubpaths[i].getSize());
//		}
	}
}
