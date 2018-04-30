package Sorting;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.FileUtils;

public class copyfiles {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File source = new File("C:/Temp/");
		File destination = new File("C:/Temp/gitcheckintest/");
	FileFilter  filter=new FileFilter() {
		
		@Override
		public boolean accept(File file) {
			// TODO Auto-generated method stub
			
			if(file.getName().toLowerCase().endsWith("xml"))
			return true;
			else
			return false;
		}
	};
		File[] files=source.listFiles(filter);
		  for (int i = 0; i < files.length; i++) {
			
				System.out.println(files[i]);

	//      FileUtils.copyFileToDirectory(files[i], destination);
			
	
		
	}

}}
