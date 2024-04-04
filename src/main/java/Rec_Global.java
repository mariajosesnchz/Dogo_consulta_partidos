import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Rec_Global {
    WebDriver driver;
    public Rec_Global(WebDriver _driver){
        driver = _driver;
    }
    public void Escribir(String texto, String xpath){
        driver.findElement(By.xpath(xpath)).sendKeys(texto);
    }
    public void EscribirTeclaControl(String tecla, String xpath){
        driver.findElement(By.xpath(xpath)).sendKeys(Keys.CONTROL,tecla);
        //driver.findElement(By.xpath(xpath)).sendKeys(Keys.F5);
    }
    public String GetText(String xpath){
        return driver.findElement(By.xpath(xpath)).getText();
    }
    public void EscribirTeclaEspecial(Keys tecla,String xpath)
    {
        driver.findElement(By.xpath(xpath)).sendKeys(tecla);
    }


}
