package org.greenswebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensWebsite {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/selenium-training-in-annanagar.html");  Thread.sleep(5000);
		driver.manage().window().maximize();  Thread.sleep(5000);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		WebElement title1 = driver.findElement(By.xpath("//h3[contains(text(),'Can’t find a batch you are looking for?')]"));
		executor.executeScript("arguments[0].scrollIntoView(true)", title1);  Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Trainer']")).click();   Thread.sleep(5000);
		
		WebElement trainername = driver.findElement(By.xpath("//h3[contains(text(),'About Our Instructor')]"));
		executor.executeScript("arguments[0].click()", trainername);  Thread.sleep(5000);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]")).click();  Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//h2[contains(text(),'Core Java Test papers')]")).click();  Thread.sleep(5000);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Selenium Test Papers')]")).click();  Thread.sleep(5000);
		
		WebElement toptrends = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));
		executor.executeScript("arguments[0].scrollIntoView(true)", toptrends);  Thread.sleep(5000);
		
		driver.findElement(By.xpath("//h3[@id='heading886691']")).click();  Thread.sleep(5000);
		
		WebElement seleniumtraining = driver.findElement(By.xpath("//h1[text()='Selenium Certification Training in Anna Nagar']"));
		executor.executeScript("arguments[0].scrollIntoView(true)", seleniumtraining);  Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]")).click();   Thread.sleep(5000);
	}

}
