package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvanceLocator extends Driver{
    @Test
    public void test1() throws InterruptedException {
           //test case1 - Putting text in the search field.
           driver.get("https://demo.nopcommerce.com/");
           driver.findElement(By.cssSelector("form > input")).sendKeys("Apple MacBook Pro 13-inch");
           Thread.sleep(2000);

           //test case2 - click the search button
           driver.findElement(By.cssSelector("button[type = 'submit'][class = 'button-1 search-box-button']")).click();
           Thread.sleep(2000);

           //test case3 - Clicking on the item
           driver.findElement(By.cssSelector("a[href^= '/apple-macbook']")).click();
           Thread.sleep(2000);

           //test case4 - add to cart button
           driver.findElement(By.cssSelector("button[id*='cart-button-4']")).click();
           Thread.sleep(3000);

           //test case5 - shopping cart link text
           driver.findElement(By.cssSelector("p>a[href = '/cart']")).click();
           Thread.sleep(3000);

           //test case6 - Validating Cart Details
           String item_code = driver.findElement(By.cssSelector("tr>td:nth-child(1)")).getText();
           String item_name = driver.findElement(By.cssSelector("tr>td:nth-child(3)")).getText();
           String item_unit_price = driver.findElement(By.cssSelector("tr>td:nth-child(4)")).getText();

           String itemQuantity = driver.findElement(By.cssSelector("tr>td>input[type='text']")).getAttribute("value");


           String item_totalPrice = driver.findElement(By.cssSelector("tr>td:nth-child(6)")).getText();
           Thread.sleep(2000);

           Assert.assertEquals(item_code,"AP_MBP_13");

           Assert.assertEquals(item_name,"Apple MacBook Pro 13-inch");

           Assert.assertEquals(item_unit_price,"$1,800.00");

           Assert.assertEquals(itemQuantity,"2");

           Assert.assertEquals(item_totalPrice,"$3,600.00");

           Thread.sleep(3000);
    }


}
