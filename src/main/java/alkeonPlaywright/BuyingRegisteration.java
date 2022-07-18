package alkeonPlaywright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
//import com.microsoft.playwright.BrowserType.LaunchOptions;

public class BuyingRegisteration {

	public static void main(String[] args) {
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
		page.navigate("https://beta-alkeon-internal.alkeon.app/login");
		//Getting Page title
		String title=page.title();
		System.out.println("My Page title is "+title);
		
	
		
		ActivityHelper activityHelper = new ActivityHelper();
		String randomActivity = activityHelper.getRandomActivity();
		
		ActivityCountry activityCountry = new ActivityCountry();
		String randomActivity2 = activityCountry.getRandomActivity2();
		
		
	   // Click text=First name >> [placeholder="First"]
	   page.locator("(//input[@name='first'])[1]").click();
	   // Fill text=First Name >> [placeholder=" Abhishek "]
	   page.locator("(//input[@name='first'])[1]").fill("Abhishek");
	   // Click text=Last name >> [placeholder="Last"]
	   page.locator("(//input[@name='last'])[1]").click();
	   // Fill text=Last Name >> [placeholder="Shetty"]
	   page.locator("(//input[@name='last'])[1]").fill("Shetty");
	    // Click text=Email >> [placeholder="Email Address"]
	   page.locator("(//input[@name='email'])[2]").click();
	   // Fill text=Email >> [placeholder="Email Address"]
	   page.locator("(//input[@name='email'])[2]").fill("maze2@mailinator.com");
	   
	   
	   // Click Number=Country code >> [placeholder="+1"]
	   page.locator("(//input[@name='countryCode'])[1]").click();
	   // Fill Number=Country code >> [placeholder="+1"]
	   page.locator("(//input[@name='countryCode'])[1]").fill("91");
	   
	   // Click text=Phone Number >> [placeholder="9988776655"]
	   page.locator("(//input[@name='phoneNumber'])[1]").click();
	   // Fill text=Phone Number >> [placeholder="9988776655"]
	   page.locator("(//input[@name='phoneNumber'])[1]").fill("9019317254");
	   
	   // Click text=Store name >> [placeholder="Store Name"]
	   page.locator("(//input[@name='company'])[1]").click();
	   // Fill text=Store name>> [placeholder="Store Name"]
	   page.locator("(//input[@name='company'])[1]").fill("Natwest Victoria");
	   
	  
	   
	   // Click text=Activity >> [placeholder="Select"]
	   page.locator("(//div[text()='Select'])[1]").click();
	   // Click =Dropdown> [placeholder="Random Activity"]
	   page.locator(String.format(" //div[text()='%s']",randomActivity)).click();
	   
	   
	   
	   // Click text=City Located In >> [placeholder="City name"]
	   page.locator("(//input[@name='city'])[1]").click();
	   // Fill text=City Located In>> [placeholder="City name"]
	   page.locator("(//input[@name='city'])[1]").fill("Bengaluru");
	   
	 
	   // Fill text=Country>> [placeholder="Select"]
	   page.locator("//*[@id=\"visitor-form\"]/form/div[2]/label[7]/div/div/div[1]").click();
	   // Click =Dropdown>> [placeholder="random country"]
	   page.locator(String.format("//div[text()='%s']",randomActivity2)).click();
	   
	   
	// Click =checkbox>> [placeholder=""]
	   page.locator("//input[@type='checkbox']").click();
	   
	   // Click =button>> [placeholder="Register"]
	  page.locator("//button[@type='submit']/span[.='Register']").click();
	  
	// Go to https://www.mailinator.com/
      page.navigate("https://www.mailinator.com/");
      
      // Click text=GO Public Inbox >> [placeholder="Enter Public Mailinator Inbox"]
      page.locator("text=GO Public Inbox >> [placeholder=\"Enter Public Mailinator Inbox\"]").click();
      
      // Fill text=GO Public Inbox >> [placeholder="Enter Public Mailinator Inbox"]
      page.locator("text=GO Public Inbox >> [placeholder=\"Enter Public Mailinator Inbox\"]").fill("maze2@mailinator.com");
      
      // Click button:has-text("GO")
      // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://www.mailinator.com/v4/public/inboxes.jsp?to=alt.fp-c6vc5xk"), () ->
      page.waitForNavigation(() -> {
        page.locator("button:has-text(\"GO\")").click();
      });
      
      // assertThat(page).hasURL("https://www.mailinator.com/v4/public/inboxes.jsp?to=alt.fp-c6vc5xk");
      // Click text=BORN >> nth=0
      page.locator("text=BORN").first().click();
      
      // assertThat(page).hasURL("https://www.mailinator.com/v4/public/inboxes.jsp?msgid=alt.fp-c6vc5xk-1657884611-1125594228");
      // Click a:has-text("Activate your account")
      
      Page page1 = page.waitForPopup(() -> {
        page.frameLocator("text=<!-- HTML EMAIL BODY -->").locator("a:has-text(\"Activate your account\")").click();
      
      });
      
      // Click input[name="password"]
      page1.locator("input[name=\"password\"]").click();
      
      // Fill input[name="password"]
      page1.locator("input[name=\"password\"]").fill("Born@1234");
      
      // Click input[name="confirmPassword"]
      page1.locator("input[name=\"confirmPassword\"]").click();
      
      // Fill input[name="confirmPassword"]
      page1.locator("input[name=\"confirmPassword\"]").fill("Born@1234");
      
      // Check input[type="checkbox"]
      page1.locator("input[type=\"checkbox\"]").check();
      
      // Click button:has-text("ACTIVATE ACCOUNT")
      // page1.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://beta-alkeon-internal.alkeon.app/landing"), () ->
      page1.waitForNavigation(() -> {
        page1.locator("button:has-text(\"ACTIVATE ACCOUNT\")").click();
      });
      
      // Click text=SIGN IN
      page1.locator("text=SIGN IN").click();
      // assertThat(page1).hasURL("https://beta-alkeon-internal.alkeon.app/login");
     
      // Click text=EmailPassword >> [placeholder="Email Address"]
      page1.locator("text=EmailPassword >> [placeholder=\"Email Address\"]").click();
      // Fill text=EmailPassword >> [placeholder="Email Address"]
      page1.locator("text=EmailPassword >> [placeholder=\"Email Address\"]").fill("maze2@mailinator.com");
     
      // Click [placeholder="\*\*\*\*\*\*"]
      page1.locator("[placeholder=\"\\*\\*\\*\\*\\*\\*\"]").click();
      // Fill [placeholder="\*\*\*\*\*\*"]
     
      page1.locator("[placeholder=\"\\*\\*\\*\\*\\*\\*\"]").fill("Born@1234");
      // Click button:has-text("Sign In")
      // page1.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://beta-alkeon-internal.alkeon.app/retailers/7HRroQrbetqkLbi/search"), () ->
     
      page1.waitForNavigation(() -> {
        page1.locator("button:has-text(\"Sign In\")").click();
      });
      // Click text=NEXT
      page1.locator("text=NEXT").click();
      // assertThat(page1).hasURL("https://beta-alkeon-internal.alkeon.app/onboarding/currencyPreference");
     
      // Click div:nth-child(2) > .action-multiple-radio
      page1.locator("div:nth-child(2) > .action-multiple-radio").click();
      // Click text=NEXT
      // page1.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://beta-alkeon-internal.alkeon.app/onboarding/buyingPreferences"), () ->
      page1.waitForNavigation(() -> {
        page1.locator("text=NEXT").click();
      });
      // Click text=Select All >> nth=0
      page1.locator("text=Select All").first().click();
      // Click text=NEXT
      // page1.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://beta-alkeon-internal.alkeon.app/onboarding/notifications"), () ->
      page1.waitForNavigation(() -> {
        page1.locator("text=NEXT").click();
      });
      // Click text=DONE
      // page1.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://beta-alkeon-internal.alkeon.app/retailers/7HRroQrbetqkLbi/search"), () ->
      page1.waitForNavigation(() -> {
        page1.locator("text=DONE").click();
      });
      // Click .Avatar__image
      page1.locator(".Avatar__image").click();
      // Click text=Logout
      // page1.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://beta-alkeon-internal.alkeon.app/landing"), () ->
      page1.waitForNavigation(() -> {
        page1.locator("text=Logout").click();
      });
      

 
	  
	//closing the browser
			browser.close();
			//closing the playwright server
			pw.close();
	
}

}