package Core_Java_samples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	private String path;
	
	public ReadFile(String file_path){
		path = file_path;
	}
	

	public String[] Openfile() throws IOException{
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		int numberoflines = readlines();
		String[] textdata = new String[numberoflines];
		for(int i =0; i<numberoflines; i++){
		textdata[i] = textReader.readLine();
		}
		textReader.close();
		return textdata;
	
	}

		int readlines() throws IOException{
		FileReader filetoRead = new FileReader(path);
		BufferedReader bf = new BufferedReader(filetoRead);
		String aLine;
		int numberoflines = 0;
		while((aLine = bf.readLine())!= null){
			numberoflines++;
			}
		bf.close();
		return numberoflines;
	}
	
	
}
