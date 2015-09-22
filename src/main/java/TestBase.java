import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static final WebDriver driver = new FirefoxDriver();
    int x;
    int y;

@BeforeTest
    public static void openBrowser(){

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://mudcu.be/sketchpad/");
}

@AfterTest
    public static void closeBrowser(){
    //driver.close();
}
    public void go(int x, int y){
        this.x = x;
        this.y = y;
    }



}
