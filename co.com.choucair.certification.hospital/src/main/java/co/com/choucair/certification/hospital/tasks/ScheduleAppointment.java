package co.com.choucair.certification.hospital.tasks;

import co.com.choucair.certification.hospital.model.DataTableSchedule;
import co.com.choucair.certification.hospital.userinterface.ScheduleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class ScheduleAppointment implements Task {

    private List<DataTableSchedule> dataTableSchedule;

    public ScheduleAppointment(List<DataTableSchedule> dataTableSchedule) {
        this.dataTableSchedule = dataTableSchedule;
    }

    public static ScheduleAppointment in(List<DataTableSchedule> dataTableSchedule) {
        return Tasks.instrumented(ScheduleAppointment.class, dataTableSchedule);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        DataTableSchedule info = dataTableSchedule.get(0);

        actor.attemptsTo(Click.on(ScheduleHomePage.BUTTON_SCHEDULE),
                Enter.theValue(info.getDateAppointment()).into(ScheduleHomePage.DATE_APPOINTMENT),
                Click.on(ScheduleHomePage.CLICK_OUTSIDE),
                Enter.theValue(info.getDocumentNumberPatient()).into(ScheduleHomePage.DOCUMENT_NUMBER_PATIENT),
                Enter.theValue(info.getDocumentNumberDoctor()).into(ScheduleHomePage.DOCUMENT_NUMBER_DOCTOR),
                Enter.theValue(info.getObservations()).into(ScheduleHomePage.OBSERVATIONS),
                Click.on(ScheduleHomePage.BOTTON_SAVE_SCHEDULE));

    }
}