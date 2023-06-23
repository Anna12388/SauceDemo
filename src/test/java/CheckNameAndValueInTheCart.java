import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CheckNameAndValueInTheCart extends BaseTest {

    @Test
    public void logInAndCheck() {
        driver.get(URL);
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement productCard = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        WebElement addToCardButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCardButton.click();
        String productName = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        String productValue = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();

        assertEquals(productName, "Sauce Labs Backpack", "Other name");
        assertEquals(productValue, "$29.99", "Other value");

    }
}




