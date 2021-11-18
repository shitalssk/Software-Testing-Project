package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class logout {
	public static void main(String[] args) throws InterruptedException  {System.setProperty("webdriver.chrome.driver", "C:\\Users\\RJ\\Desktop\\selenium jar\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RJ\\Desktop\\selenium jar\\chromedriver.exe");
	WebDriver w= new ChromeDriver();
	w.get("https://driftaway.coffee");
	w.manage().window().maximize();

	//*****************for registration	******************************************************
	
	w.findElement(By.linkText("LOGIN")).click();
	w.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/nav[2]/div[1]/ul[1]/li[4]/div[1]/a[1]/div[1]/span[1]")).click();//
	w.findElement(By.id("reg_email")).sendKeys("shitalkashid.sk@gmail.com");
	w.findElement(By.id("reg_password")).sendKeys("Shital@123");
	w.findElement(By.name("register")).click();
	w.findElement(By.linkText("LOGIN")).click();//for login////////////////
	w.findElement(By.id("username")).sendKeys("shitalkashid.sk@gmail.com");
	w.findElement(By.id("password")).sendKeys("Shital@123");
	w.findElement(By.name("login")).click();////to check functionality of coffee history
	
	w.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[2]/div/div[1]/a")).click();
/////****************************to check functionality of payment method************************************************************
   
	w.navigate().back();
    w.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[2]/div/div[3]/a")).click();
    w.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/a")).click();
  
////*****************************to check functionality of Next delivery button******************************************************
   
    w.navigate().to("https://driftaway.coffee/account/");
    w.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[2]/div/div[4]/a")).click(); ////subscribe button functionality
    w.findElement(By.linkText("SUBSCRIBE NOW")).click();

//************************************help button*************************************************************************************
   
    w.navigate().back();
    w.findElement(By.linkText("HELP")).click();
   
///**********************************************change password****************************************************************
    
    w.navigate().to("https://driftaway.coffee/account/");
	w.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[2]/div/div[5]/a")).click();
	w.findElement(By.id("password_current")).sendKeys("Shital@123");
	w.findElement(By.id("password_1")).sendKeys("123shital");
	w.findElement(By.id("password_2")).sendKeys("123shital");
	
//*******************************To check the functionality of shipping address//**************************************************
	
	w.navigate().to("https://driftaway.coffee/account/");
	w.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[2]/div/div[2]/a")).click();
   
//*********************************to check the functionality of billing address****************************************************
   
	w.findElement(By.linkText("Add")).click();
    w.findElement(By.name("billing_first_name")).sendKeys("Shital");
	w.findElement(By.id("billing_last_name")).sendKeys("Kashid");
	w.findElement(By.name("billing_address_1")).sendKeys("Adornes Domain,Hasvoko,Bulgaria");
	w.findElement(By.name("billing_address_2")).sendKeys("Adornes Domain,Hasvoko,Bulgaria");
    w.findElement(By.name("billing_city")).sendKeys("Adornes Domain");
    
//************************************to check the functionality of Shipping address*************************************************** 
   
    w.navigate().back();
    w.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div/div[3]/div[2]/a")).click();
    w.findElement(By.name("shipping_first_name")).sendKeys("Shital");
	w.findElement(By.id("shipping_last_name")).sendKeys("Kashid");
	w.findElement(By.name("shipping_address_1")).sendKeys("Adornes Domain,Hasvoko,Bulgaria");
	w.findElement(By.name("shipping_address_2")).sendKeys("Adornes Domain,Hasvoko,Bulgaria");
    w.findElement(By.name("shipping_city")).sendKeys("Adornes Domain");
    
//*****************************************To check functionality of add to cart button*****************************************
	
    w.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[4]/div/a/div/span")).click();
	w.findElement(By.xpath("/html/body/div[1]/div[1]/div[7]/main/article/div/div/div[2]/div/div/a")).click();
    
///***************************************to check functionality of about driftaway in about section*****************************
	
	w.navigate().to("https://driftaway.coffee");
	Actions a=new Actions(w);
    a.moveToElement(w.findElement(By.linkText("ABOUT"))).build().perform();
     w.findElement(By.linkText("About Driftaway")).click();
     
//*************************To check functionality of coffeeademy in about section*******************************************************
  
    w.findElement(By.linkText("Coffeecademy")).click();
	w.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]")).click();
	w.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[3]")).click();

	///**************************************review*****************************************************************//////////////////
	
	w.findElement(By.linkText("Reviews")).click();
		
	 w.navigate().to("https://driftaway.coffee");
	 Actions a1=new Actions(w);
     a1.moveToElement(w.findElement(By.linkText("ACCOUNT"))).build().perform();
     
     //*******************************logout*******************************************************************************
    
     w.findElement(By.linkText("Logout")).click();
     w.findElement(By.linkText("Confirm and log out")).click();
     w.close(); 

}

}
