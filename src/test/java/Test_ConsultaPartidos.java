import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Test_ConsultaPartidos {
    WebDriver driver;
    String url="https://www.google.com.ec/";
    @Before
    public void antes(){
        Rec_Navegador puente_sin_peaje= new Rec_Navegador();
        driver= puente_sin_peaje.abrirnavegador(url);


    }

    @Test
    public void imprimirResultadoPartido(){
        //Rec_Global puente_con_peaje = new Rec_Global(driver);
        //puente_con_peaje.Escribir("Resultado ultimo partido colombia","//*[@id=\"APjFqb\"]");
        Pag_ConsultaPartido pag_consultaPartido = new Pag_ConsultaPartido(driver);
        String equipos= " Argentina, Portugal, Colombia";
        String [] equipo= equipos.split(",");
        for (String seleccion:equipo){
            driver.get(url);
            pag_consultaPartido.ConsultaPartidosMundial(seleccion);
        }

    }
}
