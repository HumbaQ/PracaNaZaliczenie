package EduTesty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MainZD1 {


    public static void main(String[] args ){

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");

//        System.setProperty("webdriver.chrome.driver",
//                "src/main/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get(" https://mystore-testlab.coderslab.pl");


        //TopMenuPAge
        WebElement signInButton = driver.findElement(By.id("_desktop_user_info"));
        signInButton.click();

        //SignInPage

        WebElement loginEmail = driver.findElement(By.name("email"));
        WebElement loginPassword = driver.findElement(By.name("password"));
        WebElement buttonSignIn = driver.findElement(By.id("submit-login"));


        loginEmail.click();
        loginEmail.clear();
        loginEmail.sendKeys("koza@koza.pl");

        loginPassword.click();
        loginPassword.clear();
        loginPassword.sendKeys("kozaa");

        buttonSignIn.click();


        //AccountPage
        WebElement clickAddressesTile = driver.findElement(By.cssSelector("[title='Addresses']"));

        clickAddressesTile.click();
        //WebElement clickAddressesTile = driver.findElement(By.id("addresses-link"));

        //AddressPage
       WebElement buttonCreateNewAddress = driver.findElement(By.xpath("//a[@data-link-action='add-address']"));
       buttonCreateNewAddress.click();

       //NewAddresPage
        WebElement aliasBar = driver.findElement(By.className("form-control"));
        aliasBar.sendKeys("Jenot");

        WebElement addressBar = driver.findElement(By.name("address1"));
        addressBar.sendKeys("Kozie Worki");

        WebElement cityBar = driver.findElement(By.name("city"));
        cityBar.sendKeys("Jenotkowo");

        WebElement zipBar = driver.findElement(By.name("postcode"));
     zipBar.sendKeys("1234");

        WebElement countryBar = driver.findElement(By.name("id_country"));
        countryBar.sendKeys("United Kingdom");

        WebElement phoneBar = driver.findElement(By.name("phone"));
       phoneBar.sendKeys("123-123-123");

        WebElement buttonSave = driver.findElement(By.xpath("//div/form/footer/button"));
        buttonSave.click();


        //YourAddresses
        WebElement buttonDelete = driver.findElement(By.xpath("//*[text() = 'Delete']"));
       //WebElement buttonDelete = driver.findElement(By.xpath("//section/div/article/div/a[2]")); [LAST google]
        buttonDelete.click();




//        WebElement buttonDelete1 = driver.findElement(By.cssSelector("i[class=material-icons]"));
//        buttonDelete1.click();



    }
}

