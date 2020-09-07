package com.algorithms;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;



public class FileRename {

	public static void main(String[] args) {
		
		File file1 = new File(System.getProperty("user.dir") + "/sample.txt");
		File file2 = new File(System.getProperty("user.dir") + "/copyfile.txt");
		try {
			Files.copy(file1.toPath(), file2.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
