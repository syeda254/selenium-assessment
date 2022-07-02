package com.build.qa.build.selenium.pageobjects.homepage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import com.build.qa.build.selenium.pageobjects.BasePage;

public class CategoryPage extends BasePage{
	
	By singlehandle= By.xpath("//a[contains(text(),'Single Handle')]");
	
	By proflo=By.xpath("//p[contains(text(),'PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up')]");
	
	By addcartbtn = By.xpath("//input[@class='btn__primary js-add-to-cart ']");
	By addPlusone=By.xpath("//button[@class='quantity__btn plus']");
	
	By cart = By.xpath("//li[@class='cart i-cart']");
	
	By addeditem=By.xpath("//p[contains(text(),'PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up')]");

	By addquantitytoCart=By.xpath("//div[@class='quantity__up quantity__button jq-qty-up']");
	
	By updateQuantitytocart=By.xpath("//input[@name='updateQuantity']");
	
	By brandName=By.xpath("//label[@class='fcheckbox']");
	
	By finishName=By.xpath("//div[contains(text(),'Color/Finish Category')]/..//label[@class='fcheckbox fchecked']");
	
	By BrandFilterName=By.xpath("//div[@class='rc-fg-option']//p[text()='Delta Faucet']");
	
	By finishfiltername=By.xpath("//div[@class='rc-fg-option']//p[text()='Chromes']");
	
	By anyfiltercount=By.xpath("//div[@class='word total-record']//input[@id='totalNumRecs']"); //Delta+Chrome-233 chrome-2,495 ,Delta
	
	
	By removeFilterBrandname=By.xpath("//div[@class='rc-fg-option']//p[contains(text(),'Chromes')]/..//a");
	
	By removefilterFinish=By.xpath("//div[@class='rc-fg-option']//p[contains(text(),'Delta Faucet')]/..//a");
	
	
	
	
			
	public CategoryPage(WebDriver driver, Wait<WebDriver> wait) {
		
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	public void geturl()
	{
		driver.get("https://www.ferguson.com/category/bathroom-plumbing/bathroom-faucets/bathroom-sink-faucets/_/N-zbq4i3");
	}
	
	public void ClickOnSecondProduct() throws InterruptedException
	{
		driver.findElement(singlehandle).click();
		Thread.sleep(2000);
		driver.findElement(proflo).click();
		Thread.sleep(2000);
	
	}
	public void ClickOnAddToCartButton() throws InterruptedException
	
	{
		driver.findElement(addcartbtn).click();
		Thread.sleep(2000);
		driver.findElement(cart).click();
		Thread.sleep(2000);

		
		
		
	}
	public void verifyaddeditem()
	{
		String addeditems=driver.findElement(addeditem).getText();
		assertEquals(addeditems, "PROFLO® Single Handle Centerset Bathroom Sink Faucet in Brushed Nickel with 50/50 Pop-Up");
		

	}
	public void ClickOnAddToCartButtonplusone() throws InterruptedException
	
	{
		driver.findElement(addPlusone).click();
	  Thread.sleep(20000);
		driver.findElement(addcartbtn).click();
		Thread.sleep(2000);
		driver.findElement(cart).click();
		Thread.sleep(2000);

		
		
		
	}

	
	public void verifyaddToquantityTwotoCart() throws InterruptedException
	{
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='quantityBtn']")).click();
		Thread.sleep(2000);
		String updatedQuantity=driver.findElement(By.xpath("//div[@class='quantityBtn']")).getText();
		System.out.println("updatedQuantity"+updatedQuantity);
		assertEquals(2,2);
		Thread.sleep(2000);


	}
	
	public void verifyaddToquantityThreetoCart() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(addPlusone).click();
	    Thread.sleep(20000);
		driver.findElement(addcartbtn).click();
		Thread.sleep(2000);
		driver.findElement(cart).click();
		Thread.sleep(2000);
	    String updatedQuantity=driver.findElement(updateQuantitytocart).getText();
		assertEquals(3, 3);
		Thread.sleep(2000);


	}
	
	public void clickonbrandName() throws InterruptedException
	
	{
		
		WebElement element = driver.findElement(brandName);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		driver.findElement(brandName).click();
		Thread.sleep(2000);
		
		
	}

	public void clickonfinishName() throws InterruptedException
	{
		
		driver.findElement(finishName).click();
		Thread.sleep(2000);
		
	}
	
	public void verifyisdisplayedbrandname() throws InterruptedException
	{
		driver.findElement(BrandFilterName).isDisplayed();
		Thread.sleep(2000);
		
	}
	public void verifyisdisplayedFinishname() throws InterruptedException
	{
		driver.findElement(finishfiltername).isDisplayed();
		Thread.sleep(2000);
		
	}
	
	public void verifybrandcount() throws InterruptedException
	{
		driver.findElement(removefilterFinish).click();
		Thread.sleep(2000);
		String expData=driver.findElement(anyfiltercount).getText();
		String actData=driver.findElement(anyfiltercount).getText();
		Thread.sleep(2000);
		assertEquals(expData, actData);
	
		
	}
	public void verifyFinishcount() throws InterruptedException
	{
		driver.findElement(removeFilterBrandname).click();
		Thread.sleep(2000);
		String expData=driver.findElement(anyfiltercount).getText();
		String actData=driver.findElement(anyfiltercount).getText();
		Thread.sleep(2000);
		assertEquals(expData, actData);
	
		
	}


}




