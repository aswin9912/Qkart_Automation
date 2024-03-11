package Qkart_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Elements {
	WebDriver d;
	public Elements(WebDriver d) {
		this.d=d;
	}
    By logo=By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/a/img");
	By search=By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/input");
	By register=By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button[2]");
	By login=By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/button[1]");
	By username=By.xpath("//*[@id=\"username\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By confirmpass=By.xpath("//*[@id=\"confirmPassword\"]");
	By registernow=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button");
	By addtocart=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[2]/div[1]/div/div[2]/button");
	By Size=By.id("uncontrolled-native");
	By loginclick=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/button");
	public void Logo() {
		d.findElement(logo).isDisplayed();
	}
	
	public void Register(String user, String Pass) {
		d.findElement(register).click();
		d.findElement(username).sendKeys(user);
		d.findElement(password).sendKeys(Pass);
		d.findElement(confirmpass).sendKeys(Pass);
		d.findElement(registernow).click();
		
		}
	public void Login(String user, String Pass) throws InterruptedException {
		d.findElement(login).click();
		d.findElement(username).sendKeys(user);
		d.findElement(password).sendKeys(Pass);
		 
		
		d.findElement(loginclick).click();
		Thread.sleep(5000);
	}
	public void Purchase(String value) throws InterruptedException {
		d.findElement(search).sendKeys(value);
		WebElement size=d.findElement(Size);
		Thread.sleep(5000);
		size.click();
		Select s=new Select(size);
		s.selectByVisibleText("9");
		d.findElement(addtocart).click();
	}

}
