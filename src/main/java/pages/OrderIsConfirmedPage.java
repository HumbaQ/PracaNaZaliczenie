package pages;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class OrderIsConfirmedPage {
    private static WebDriver driver;

    public OrderIsConfirmedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void confiramtionPrintScreen () throws IOException {

    Date currentDate = new Date();
    String screenshotNew = currentDate.toString().replace(" ","-").replace(":","-");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)","");

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.9'");

    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshotFile, new File(".//src/test/Screenshots/ZD2//" + screenshotNew + ".png"));



    }

}
