package com.erol.gettitle;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateCsv {

	
	 public void generateCsvFile(String sFileName,String text)
	   {
			try
			{
			    FileWriter writer = new FileWriter(sFileName);
		 
			    writer.append(text);
			    writer.append(',');
			    writer.append('\n');
			    
		 
			    writer.flush();
			    writer.close();
			}
			catch(IOException e)
			{
			     e.printStackTrace();
			} 
	    }
		
}
