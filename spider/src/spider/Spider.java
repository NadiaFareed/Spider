package spider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://www.shophive.com/apple/mac");
		 List<WebElement> linksofweb = Driver.findElements(By.tagName("a"));
		
	       
		 for (WebElement myElement : linksofweb){
	         String linkofweb = myElement.getText(); 
	          
	        if (linkofweb !=""){

				java.util.List<WebElement> price = Driver.findElements(By
						.className("price-box"));
				java.util.List<WebElement> product = Driver.findElements(By
						.className("product-name"));

				try {
					for (int i = 0; i <= product.size(); i++) {

						System.out.println( "**Product** = "
								+ product.get(i).getText() + "\n**Price**= "
								+ price.get(i).getText());

					}

				} catch (IndexOutOfBoundsException e) {
					System.out.println("-------");
				}
	            }
	            
	          } 
		Driver.close();
	}
	}


