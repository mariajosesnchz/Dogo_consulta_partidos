import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Rec_Navegador {
    WebDriver driver;
    public ChromeDriver abrirnavegador(String url){
        System.out.println("Hola a todos");
        WebDriverManager.chromedriver().setup();
        //opciones del navegador
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("-incognito");

        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        return (ChromeDriver) driver;

    }
}
