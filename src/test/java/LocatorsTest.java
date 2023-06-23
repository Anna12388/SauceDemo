import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsTest extends BaseTest{
        @Test
    public void checkLocators(){

            driver.get(URL);

            WebElement username = driver.findElement(By.name("user-name"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.className("btn_action"));

            username.sendKeys("standard_user");
            password.sendKeys("secret_sauce");
            loginButton.click();

            WebElement productCard = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
            WebElement addToCardButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
            addToCardButton.click();

            driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
            WebElement checkoutButton = driver.findElement(By.id("checkout"));
            checkoutButton.click();

            WebElement firstName = driver.findElement(By.id("first-name"));
            WebElement lastName = driver.findElement(By.id("last-name"));
            WebElement zipCode = driver.findElement(By.id("postal-code"));

            firstName.sendKeys("Name");
            lastName.sendKeys("Lastname");
            zipCode.sendKeys("12345");

            WebElement continueButton = driver.findElement(By.id("continue"));
            continueButton.click();

            WebElement finishButton = driver.findElement(By.id("finish"));
            finishButton.click();

            WebElement footer = driver.findElement(By.tagName("footer"));
            WebElement twitter = driver.findElement(By.linkText("Twitter"));
            WebElement facebook = driver.findElement(By.partialLinkText("Face"));

            WebElement burgerMenuButton = driver.findElement(By.cssSelector(".bm-burger-button"));

        }
    }
