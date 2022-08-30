package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HummPrtSweItemID1Page {
    private WebDriver driver;

    public HummPrtSweItemID1Page(WebDriver driver) {
        this.driver = driver;
    }
    public void chooseSize(){
        WebElement chooseSize = driver.findElement(By.xpath("//option[@title='M']"));
        chooseSize.click();
    }

    public void chooseAmount() throws InterruptedException {
       // WebElement chooseAmount = driver.findElement(By.id("quantity_wanted"));
        //WebElement chooseAmount1 = driver.findElement(By.xpath("//div/div/div/span/button"));
        //WebElement chooseAmount3 = driver.findElement(By.cssSelector("[class='material-icons touchspin-up']"));
       // WebElement chooseAmount4 = driver.findElement(By.cssSelector("i.material-icons.touchspin-up"));
        //WebElement chooseAmount5 = driver.findElement(By.cssSelector("i.material-icons.touchspin-up"));

        //Niewiedzieć czemu na chromie nie działąją prawidłowo poniższe metody.
//        chooseAmount.click();
//        chooseAmount.clear();
//        chooseAmount.sendKeys("5");


            //daje losowe wyniki na stronie.
//        int clicks = 0;
//        while(clicks<4){
//            chooseAmount4.click();
//            clicks++;
//        }
                //daje losowe wyniki na stronie.
//            for (int clicks = 0; clicks < 7; clicks++) { //daje losowe wyniki na stronie XD
//                chooseAmount5.click();
//                    Thread.sleep(1000);
//            }
            //daje losowe wyniki na stronie.

        WebElement chooseAmount = driver.findElement(By.cssSelector("i.material-icons.touchspin-up"));
        for (int clicks = 0; clicks < 5; clicks++) {
            chooseAmount.click();
            Thread.sleep(1000);
        }
    }
    public void setClickAddToCart() {

    WebElement clickAddToCart = driver.findElement(By.xpath("//div[@class='add']"));
    clickAddToCart.click();

    }
    public void checkDiscount(){
        System.out.println("\n");
        System.out.println("Discount Test1 Info about %");

        if (driver.getPageSource().contains("Save 20%")) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Discount is present." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Discount is absent" + ANSI_RESET);
        }
        System.out.println("\n");
        System.out.println("Discount Test2 Info about new price");

        if (driver.getPageSource().contains("€28.72")) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Lower amount is present." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Lower amount is absent" + ANSI_RESET);
        }

        System.out.println("\n");
        System.out.println("Discount Test3 Info about old price");

        if (driver.getPageSource().contains("€35.90")) {
            System.out.println(ANSI_GREEN_BACKGROUND + "Lower amount is present." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Lower amount is absent" + ANSI_RESET);
        }

    }
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

    public static final String ANSI_RESET = "\u001B[0m";

}

