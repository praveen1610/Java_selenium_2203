package Core_Java_samples;

import java.io.IOException;

public class FileData {
	public static void main(String[] args) throws IOException{
		String file_name = "Notepad_reading_input";
		try{
			ReadFile file = new ReadFile(file_name);
			String[] arylines = file.Openfile();
			
			for(int i = 0; i<arylines.length; i++){
			System.out.println(arylines[i]);
			}
		}
		catch (Exception e){
			System.out.println("Errorrrr");
			System.out.println(e.getMessage());
			
		}
	}

}
