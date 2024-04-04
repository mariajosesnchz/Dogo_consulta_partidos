import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Pag_ConsultaPartido {
    public WebDriver driver;
    public Pag_ConsultaPartido(WebDriver _driver){
        driver= _driver;
    }
    public void ConsultaPartidosMundial(String equipo) {
        Rec_Global rec_global = new Rec_Global(driver);
        String inp_BarraBusquedarelativo = "//*[@name='q']";
        String txtSeleccion = "//*[@id=\"sports-app\"]/div/div[1]/div/div/div[1]/div/div[2]/div[2]";
        rec_global.Escribir("Resultado Ultimo Partido" + equipo, inp_BarraBusquedarelativo);
        rec_global.EscribirTeclaControl("A",inp_BarraBusquedarelativo);
        rec_global.EscribirTeclaEspecial(Keys.ENTER,inp_BarraBusquedarelativo);
        String nombreSeleccion=rec_global.GetText(txtSeleccion);
        System.out.println(nombreSeleccion);


    }
}
