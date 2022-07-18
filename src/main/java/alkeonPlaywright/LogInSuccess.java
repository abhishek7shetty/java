package alkeonPlaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LogInSuccess {

	public static void main(String[] args) {
		//Starting the playwright server
				Playwright pw=Playwright.create();
				//Getting the browser context
				Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
				
				
			/*	LaunchOptions lo=new LaunchOptions();
				lo.setChannel("chrome");
				lo.setHeadless(false);
				Browser browser=pw.chromium().launch(lo);*/
				
				//Getting the page context
				Page page=browser.newPage();
				//Navigating to URL
				page.navigate("https://dev-born.alkeon.app/login");
				//Getting Page title
				String title=page.title();
				System.out.println("My Page title is "+title);
				
			   // Click text=EmailPassword >> [placeholder="Email Address"]
			   page.locator("(//input[@name='email'])[1]").click();
			   // Fill text=EmailPassword >> [placeholder="Email Address"]
			   page.locator("(//input[@name='email'])[1]").fill("vas@yopmail.com");
			   // Click [placeholder="\*\*\*\*\*\*"]
			   page.locator("(//input[@name='password'])[1]").click();
			   // Fill [placeholder="\*\*\*\*\*\*"]
			   page.locator("(//input[@name='password'])[1]").fill("Born@1234");
			   // Click button:has-text("Sign In")
			   // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://dev-born.alkeon.app/brands/Za49DmTdqg8Yj0i/showcase/collection"), () ->
			   page.waitForNavigation(() -> {
			    page.locator("(//button[@type='submit']/span[.='Sign In'] ) ").click();
			   });
			   
			 //closing the browser
				browser.close();
				//closing the playwright server
				pw.close();
			
	}

}
