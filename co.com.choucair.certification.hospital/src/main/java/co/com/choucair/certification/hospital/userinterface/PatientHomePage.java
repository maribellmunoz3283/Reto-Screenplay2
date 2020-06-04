package co.com.choucair.certification.hospital.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class PatientHomePage  {

    public static final Target ADD_PATIENT = Target.the("boton inicial adicionar doctor")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[2]"));
    public static final Target NAME_PATIENT = Target.the("nombre doctor")
            .located(By.name("name"));
    public static final Target LAST_NAME_PATIENT = Target.the("apellido doctor")
            .located(By.name("last_name"));
    public static final Target PHONE_PATIENT = Target.the("telefono doctor")
            .located(By.name("telephone"));
    public static final Target LISTDOCUMENT = Target.the("lista documento")
            .located(By.name("identification_type"));
    public static final Target DOCUMENT_NUMBER_PATIENT = Target.the("numero documento doctor")
            .located(By.name("identification"));
    public static final Target CHECKBOX = Target.the("numero documento doctor")
            .located(By.name("prepaid"));
    public static final Target BOTTON_SAVE = Target.the("numero documento doctor")
            .located(By.xpath("//a[@class='btn btn-primary pull-right']"));
    public static final Target THE_ANSWER_PATIENT = Target.the("numero documento doctor")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));







}
