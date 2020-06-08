package com.syntax.class25;

interface TakeScreenShot extends WebDriver{
	void takePicture();
}

public interface WebDriver {
void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();

}
class ChromBrowser implements WebDriver, TakeScreenShot{

	@Override
	public void openBrowser() {
		System.out.println("Chrombrowser can open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chormbrowser can closs the browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("It can  Maximize the windows");
		
	}

	@Override
	public void findElement() {
		System.out.println("Finaly, Chromebrowser can find element through the search botton");
		
	}

	@Override
	public void takePicture() {
		System.out.println("Now you can take screenshot with chrombrowser");
		
	}
	
}
class FirfaxBrowser implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("FirfaxBrowser can open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("FirfaxBrowser can close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("FirfaxBrowser can mazimize windows");
		
	}

	@Override
	public void findElement() {
		System.out.println("FirfaxBrowser can take screenshots");
		
	}
}


