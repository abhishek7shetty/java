package alkeonPlaywright;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;
public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      // Open new page
      Page page = context.newPage();
      // Go to https://dev-born.alkeon.app/login
      page.navigate("https://dev-born.alkeon.app/login");
      // Click text=EmailPassword >> [placeholder="Email Address"]
      page.locator("text=EmailPassword >> [placeholder=\"Email Address\"]").click();
      // Fill text=EmailPassword >> [placeholder="Email Address"]
      page.locator("text=EmailPassword >> [placeholder=\"Email Address\"]").fill("adidas@yopmail.com");
      // Press Tab
      page.locator("text=EmailPassword >> [placeholder=\"Email Address\"]").press("Tab");
      // Fill [placeholder="\*\*\*\*\*\*"]
      page.locator("[placeholder=\"\\*\\*\\*\\*\\*\\*\"]").fill("Born@1234");
      // Click button:has-text("Sign In")
      // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://dev-born.alkeon.app/brands/tHAQzyhxyNnTXqW/showcase/collection"), () ->
      page.waitForNavigation(() -> {
        page.locator("button:has-text(\"Sign In\")").click();
      });
      // Click .Avatar__image >> nth=0
      page.locator(".Avatar__image").first().click();
      // Click #sticky-main-header >> text=Products
      page.locator("#sticky-main-header >> text=Products").click();
      // assertThat(page).hasURL("https://dev-born.alkeon.app/brands/tHAQzyhxyNnTXqW/settings/products");
      // Click button:has-text("Product")
      page.locator("button:has-text(\"Product\")").click();
      // assertThat(page).hasURL("https://dev-born.alkeon.app/brands/tHAQzyhxyNnTXqW/product/create");
      // Click text=Beauty & Wellness
      page.locator("text=Beauty & Wellness").click();
      // Click [placeholder="Unique product identification code"]
      page.locator("[placeholder=\"Unique product identification code\"]").click();
      // Fill [placeholder="Unique product identification code"]
      page.locator("[placeholder=\"Unique product identification code\"]").fill("45615");
      // Click [placeholder="Product Name"]
      page.locator("[placeholder=\"Product Name\"]").click();
      // Fill [placeholder="Product Name"]
      page.locator("[placeholder=\"Product Name\"]").fill("Cream");
      // Click textarea[name="description"]
      page.locator("textarea[name=\"description\"]").click();
      // Fill textarea[name="description"]
      page.locator("textarea[name=\"description\"]").fill("100ml");
      // Click text=Bath and Body
      page.locator("text=Bath and Body").click();
      // Click text=Lotions + Oils
      page.locator("text=Lotions + Oils").click();
      // Click [placeholder="e\.g Organic"]
      page.locator("[placeholder=\"e\\.g Organic\"]").click();
      // Fill [placeholder="e\.g Organic"]
      page.locator("[placeholder=\"e\\.g Organic\"]").fill("Cream");
      // Click text=Creamy >> nth=1
      page.locator("text=Creamy").nth(1).click();
      // Click #description-section div:has-text("Select from list") >> nth=3
      page.locator("#description-section div:has-text(\"Select from list\")").nth(3).click();
      // Click #react-select-10-option-5 >> text=Fall/Winter 2021
      page.locator("#react-select-10-option-5 >> text=Fall/Winter 2021").click();
      // Click text=CurrencySelect >> svg
      page.locator("text=CurrencySelect >> svg").click();
      // Click #react-select-11-option-2 >> text=GBP
      page.locator("#react-select-11-option-2 >> text=GBP").click();
      // Click [placeholder="e\.g 250"]
      page.locator("[placeholder=\"e\\.g 250\"]").click();
      // Fill [placeholder="e\.g 250"]
      page.locator("[placeholder=\"e\\.g 250\"]").fill("450");
      // Click [placeholder="e\.g 500"]
      page.locator("[placeholder=\"e\\.g 500\"]").click();
      // Fill [placeholder="e\.g 500"]
      page.locator("[placeholder=\"e\\.g 500\"]").fill("600");
      // Click [placeholder="Key ingredients used in the product\. e\.g Aloe"]
      page.locator("[placeholder=\"Key ingredients used in the product\\. e\\.g Aloe\"]").click();
      // Fill [placeholder="Key ingredients used in the product\. e\.g Aloe"]
      page.locator("[placeholder=\"Key ingredients used in the product\\. e\\.g Aloe\"]").fill("vi");
      // Click text=Violet Extract
      page.locator("text=Violet Extract").click();
      // Click .Product__Form__details > label > .select-picker > .select__picker__control > .select__picker__value-container >> nth=0
      page.locator(".Product__Form__details > label > .select-picker > .select__picker__control > .select__picker__value-container").first().click();
      // Click #react-select-12-option-7
      page.locator("#react-select-12-option-7").click();
      // Click .Input__label.Input__label--split > .select-picker > .select__picker__control > .select__picker__value-container >> nth=0
      page.locator(".Input__label.Input__label--split > .select-picker > .select__picker__control > .select__picker__value-container").first().click();
      // Fill text=Country of Origin (required) option Afghanistan focused, 1 of 246. 246 results a >> input[type="text"]
      page.locator("text=Country of Origin (required) option Afghanistan focused, 1 of 246. 246 results a >> input[type=\"text\"]").fill("ind");
      // Click #react-select-13-option-101
      page.locator("#react-select-13-option-101").click();
      // Click [placeholder="e\.g Sea Breeze"]
      page.locator("[placeholder=\"e\\.g Sea Breeze\"]").click();
      // Fill [placeholder="e\.g Sea Breeze"]
      page.locator("[placeholder=\"e\\.g Sea Breeze\"]").fill("br");
      // Click text=breeze
      page.locator("text=breeze").click();
      // Click [placeholder="e\.g SBR"]
      page.locator("[placeholder=\"e\\.g SBR\"]").click();
      // Fill [placeholder="e\.g SBR"]
      page.locator("[placeholder=\"e\\.g SBR\"]").fill("456");
      // Click text=+ Add Scent Code 456
      page.locator("text=+ Add Scent Code 456").click();
      // Click [placeholder="e\.g Black"]
      page.locator("[placeholder=\"e\\.g Black\"]").click();
      // Fill [placeholder="e\.g Black"]
      page.locator("[placeholder=\"e\\.g Black\"]").fill("bla");
      // Click text=black and white
      page.locator("text=black and white").click();
      // Click [placeholder="e\.g BLK"]
      page.locator("[placeholder=\"e\\.g BLK\"]").click();
      // Fill [placeholder="e\.g BLK"]
      page.locator("[placeholder=\"e\\.g BLK\"]").fill("b");
      // Click text=beige >> nth=0
      page.locator("text=beige").first().click();
      // Click #details-section div:has-text("Select from List") >> nth=3
      page.locator("#details-section div:has-text(\"Select from List\")").nth(3).click();
      // Click #react-select-14-option-0 >> text=Black
      page.locator("#react-select-14-option-0 >> text=Black").click();
      // Click .Product__Form__sizingAndMeasurement > label > .select-picker > .select__picker__control > .select__picker__indicators > .select__picker__indicator
      page.locator(".Product__Form__sizingAndMeasurement > label > .select-picker > .select__picker__control > .select__picker__indicators > .select__picker__indicator").click();
      // Click #react-select-15-option-4 >> text=cm
      page.locator("#react-select-15-option-4 >> text=cm").click();
      // Click [placeholder="e\.g 24"]
      page.locator("[placeholder=\"e\\.g 24\"]").click();
      // Fill [placeholder="e\.g 24"]
      page.locator("[placeholder=\"e\\.g 24\"]").fill("10");
      // Click [placeholder="Additional description of measurement"]
      page.locator("[placeholder=\"Additional description of measurement\"]").click();
      // Fill [placeholder="Additional description of measurement"]
      page.locator("[placeholder=\"Additional description of measurement\"]").fill("45");
      // Click [placeholder="Select Date"] >> nth=0
      page.locator("[placeholder=\"Select Date\"]").first().click();
      // Click [aria-label="Choose Wednesday\, July 6th\, 2022"]
      page.locator("[aria-label=\"Choose Wednesday\\, July 6th\\, 2022\"]").click();
      // Click [placeholder="Select Date"] >> nth=1
      page.locator("[placeholder=\"Select Date\"]").nth(1).click();
      // Click [aria-label="Choose Wednesday\, July 20th\, 2022"]
      page.locator("[aria-label=\"Choose Wednesday\\, July 20th\\, 2022\"]").click();
      // Click text=Select from List
      page.locator("text=Select from List").click();
      // Click #react-select-16-option-7
      page.locator("#react-select-16-option-7").click();
      // Click [placeholder="e\.g 036000029145x"]
      page.locator("[placeholder=\"e\\.g 036000029145x\"]").click();
      // Fill [placeholder="e\.g 036000029145x"]
      page.locator("[placeholder=\"e\\.g 036000029145x\"]").fill("9666645");
      // Click .add-file-icon >> nth=0
      page.locator(".add-file-icon").first().click();
      // Click input[type="file"]
      page.locator("input[type=\"file\"]").click();
      // Upload Screenshot 2021-07-26 at 11.02.08 AM.png
    //  page.locator("input[type=\"file\"]").setInputFiles(Paths.get("Screenshot 2021-07-26 at 11.02.08 AM.png"));
      // Click button:has-text("done")
      page.locator("button:has-text(\"done\")").click();
      // Click button:has-text("save")
      // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://dev-born.alkeon.app/brands/tHAQzyhxyNnTXqW/settings/products"), () ->
      page.waitForNavigation(() -> {
        page.locator("button:has-text(\"save\")").click();
      });
      // Click text=Order Ascending
      page.locator("text=Order Ascending").click();
      // Click #react-select-19-option-5 >> text=Newest First
      page.locator("#react-select-19-option-5 >> text=Newest First").click();
      // assertThat(page).hasURL("https://dev-born.alkeon.app/brands/tHAQzyhxyNnTXqW/settings/products?sort=dateDescending");
    }
  }
}