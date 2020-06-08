package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		
		TakeScreenShot take=new ChromBrowser();
		take.openBrowser();
		take.closeBrowser();
		take.findElement();
		take.maximizeWindow();
		take.takePicture();
		System.out.println("***************************************************");
		WebDriver web=new FirfaxBrowser();
		web.openBrowser();
		web.closeBrowser();
		web.findElement();
		web.findElement();
		
		

	}

}
