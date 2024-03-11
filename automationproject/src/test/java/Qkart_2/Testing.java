package Qkart_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Qkart_1.Elements;

public class Testing {
	WebDriver d;
	String baseurl="https://crio-qkart-frontend-qa.vercel.app/";

@BeforeTest
public void setup() {
	d=new ChromeDriver();
}
@BeforeMethod
public void url() {
	d.get(baseurl);
}
@Test
public void test() throws InterruptedException {
	 Elements obj= new Elements(d);
	 obj.Logo();
	 obj.Register("aswin1999", "aswin@1999");
	 obj.Login("aswin123", "aswin@123");
	 obj.Purchase("shoes");
	
}
}
