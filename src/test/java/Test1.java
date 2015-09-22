import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;

import static org.openqa.grid.common.RegistrationRequest.build;

public class Test1 extends TestBase{



    @Test
        public void go( ) {
        //WebElement diametr  = driver.findElement(By.id("diameter_brushCur"));
        //diametr.
        WebElement options_button  = driver.findElement(By.id("ioptions"));
        options_button.click();

        WebElement canvas  = driver.findElement(By.id("ctx_temp"));
        System.out.println(canvas.getSize());
        WebElement pencil = driver.findElement(By.xpath("//div[contains (@title, 'Brush')]"));
        pencil.click();


        Actions actions = new Actions(driver);
        actions.moveToElement(canvas).clickAndHold();


        //Graphics oval = null;
        //oval.drawOval(20, 110, 150, 60);
        //actions.moveToElement(canvas, 200, 150).click();

        actions.moveByOffset(200, 0);

        actions.moveByOffset(0, 200);
        actions.moveByOffset(-200, 0);
        actions.moveByOffset(0, -200);

        actions.release();
        actions.perform();

}
   // public void paint(Graphics g) {
        //g.drawOval(20, 110, 150, 60);
    //}
}
