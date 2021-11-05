package org.Utility;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;


		import io.github.bonigarcia.wdm.WebDriverManager;

		public class BaseClass { 
			
			  public static WebDriver driver;
			 public static Actions a;
			
			
			public static void launchChrome() {
				
				WebDriverManager.chromedriver().setup();
				
				driver = new ChromeDriver();

			}
			
			  public static void launchurl(String url) {
			  driver.get(url);

			}
				  
			  public static void winmax() {
				
				  driver.manage().window().maximize();

			}
			  
			  public static void printTitle() {
			
				  String title = driver.getTitle();
				System.out.println(title);
				  
				  
			}
			  public static void printcurrenturl() {
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);

			}
			  public static void fill(WebElement ele,String s) {
				  ele.sendKeys(s);

			}
			  
			  public static void btnclick(WebElement ele) {
				ele.click();

			}
			 
			  public static void move(WebElement ele) {
				a.moveToElement(ele);
			}
			  
		     public static void actioninstall() {
				a=new Actions(driver);

		     }
		     
		    public static void pickAndplace(WebElement ele1,WebElement ele2) {
				a.dragAndDrop(ele1, ele2).perform();

			}
			  
			   public static void captial(WebElement ele, String value) {
			   a.keyDown(Keys.SHIFT).sendKeys(ele,value).keyUp(Keys.SHIFT).build().perform();

			}
		
		public static String returntitle() {
		 String t = driver.getTitle();
		 return t;
		}
		public void closebrowser() {
			driver.close();

		}
		
		
	}

