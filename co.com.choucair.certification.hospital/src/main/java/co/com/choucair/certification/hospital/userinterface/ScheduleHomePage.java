package co.com.choucair.certification.hospital.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ScheduleHomePage {

    public static final Target BUTTON_SCHEDULE = Target.the("boton inicial agendar cita")
            .located(By.xpath("(//a[@class='list-group-item'])[6]"));
    public static final Target DATE_APPOINTMENT = Target.the("Día de la cita")
            .located(By.id("datepicker"));
    public static final Target CLICK_OUTSIDE = Target.the("Día de la cita")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]"));
    public static final Target DOCUMENT_NUMBER_PATIENT = Target.the("apellido doctor")
            .located(By.xpath("(//input[@class='form-control'])[1]"));
    public static final Target DOCUMENT_NUMBER_DOCTOR = Target.the("telefono doctor")
            .located(By.xpath("(//input[@class='form-control'])[2]"));
    public static final Target OBSERVATIONS = Target.the("")
            .located(By.xpath("//textarea[@class='form-control']"));
    public static final Target BOTTON_SAVE_SCHEDULE = Target.the("numero documento doctor")
            .located(By.xpath("//a[@class='btn btn-primary pull-right']"));
    public static final Target THE_ANSWER_SCHEDULE = Target.the("numero documento doctor")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));
}
