package co.com.choucair.certification.hospital.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class DoctorHomePage  {

    public static final Target ADD_DOCTOR = Target.the("boton inicial adicionar doctor")
            .located(By.xpath("(//a[@class='list-group-item'])[1]"));
    public static final Target NAME_DOCTOR = Target.the("nombre doctor")
            .located(By.id("name"));
    public static final Target LAST_NAME_DOCTOR = Target.the("apellido doctor")
            .located(By.id("last_name"));
    public static final Target PHONE_DOCTOR = Target.the("telefono doctor")
            .located(By.id("telephone"));
    public static final Target LISTDOCUMENT = Target.the("lista documento")
            .located(By.id("identification_type"));
    public static final Target DOCUMENT_NUMBER_DOCTOR = Target.the("numero documento doctor")
            .located(By.id("identification"));
    public static final Target CLICK_GUARDAR = Target.the("click en guardar")
            .located(By.xpath("//a[contains(.,'Guardar')]"));
    public static final Target ANSWER_DOCTOR = Target.the("click en guardar")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));



}
