package Coding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver cd = new ChromeDriver();
		
		String propertyFileAddress = "C:\\Users\\Lenovo\\eclipse-workspace\\RahmanAbcTesting\\DataDrivenFramework\\src\\values.properties";
		FileInputStream fis = new FileInputStream(propertyFileAddress);
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		System.out.println(url);
		
		cd.get(url);
		
		String SearchBoxXpath = p.getProperty("searchBoxXpath");
		String search = p.getProperty("search");
		cd.findElement(By.xpath(SearchBoxXpath)).sendKeys(search);
		
		
		
		
		
		
	}

}
