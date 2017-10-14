package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.enums.ProductName;

import java.util.List;

public class AutoComplete {

    public static void selectOption(ProductName productName) {
        List<WebElement> optionsToSelect = Browser.driver.findElements(By.xpath("//div[@class='searchlist']"));
        for(WebElement option : optionsToSelect){
            System.out.println(option);
            if(option.getText().equals(productName.getProductName())) {
                System.out.println("Trying to select: "+productName.getProductName());
                option.click();
                break;
            }
        }
    }

}
