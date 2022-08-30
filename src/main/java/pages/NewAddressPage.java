package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAddressPage {

    private WebDriver driver;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillBarsOnNewAddressPage(String alias, String address , String city, String postcode, String country, String phone) {
        WebElement aliasBar = driver.findElement(By.className("form-control"));
        WebElement addressBar = driver.findElement(By.name("address1"));
        WebElement cityBar = driver.findElement(By.name("city"));
        WebElement zipBar = driver.findElement(By.name("postcode"));
        WebElement countryBar = driver.findElement(By.xpath("//option[@value='17']"));
        //WebElement countryBar = driver.findElement(By.name("id_country"));
        //WebElement chosenCountry = driver.findElement(By.xpath("//*[text() = 'United Kingdom']"));
        WebElement phoneBar = driver.findElement(By.name("phone"));


        aliasBar.click();
        aliasBar.clear();
        aliasBar.sendKeys(alias);

        addressBar.click();
        addressBar.clear();
        addressBar.sendKeys(address);

        cityBar.click();
        cityBar.clear();
        cityBar.sendKeys(city);

        zipBar.click();
        zipBar.clear();
        zipBar.sendKeys(postcode);

        countryBar.click();
        countryBar.click();


        phoneBar.click();
        phoneBar.clear();
        phoneBar.sendKeys(phone);
    }

public void clickButtonSave() {
            WebElement buttonSave = driver.findElement(By.xpath("//div/form/footer/button"));
            buttonSave.click();
        }

    }

