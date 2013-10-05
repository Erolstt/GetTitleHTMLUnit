package com.capuatest.get;


import java.io.FileWriter;
import java.io.IOException;


import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.capuatest.get.Timerol;


public class HTTPGetTitle {

	
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("C:\\load.csv");
			Timerol timer = new Timerol();
			
			HtmlUnitDriver driver = new HtmlUnitDriver();
			
			for (int i = 1; i <= 10; i++) {
				
				timer.start();
				
				driver.get("http://docs.seleniumhq.org/");
				driver.getPageSource();
				
				timer.end();
				
				System.out.println(i+" "+driver.getTitle()+"-------> Time : " + timer.getTotalTime());
				
				writer.append(String.valueOf(timer.getTotalTime()));
				writer.append(',');
				
				writer.append('\n');
				writer.flush();			
				}
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	
		
		
	}

}
