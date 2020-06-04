package co.com.choucair.certification.hospital.tasks;

import co.com.choucair.certification.hospital.model.DataTable;
import co.com.choucair.certification.hospital.userinterface.DoctorHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class AddDoctor implements Task {

    private  List<DataTable> dataTable;

    public AddDoctor(List<DataTable> dataTable) {
        this.dataTable = dataTable;
    }

    public static AddDoctor doctor(List<DataTable> dataTable) {

        return Tasks.instrumented(AddDoctor.class,dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        DataTable info = dataTable.get(0);

       actor.attemptsTo(Click.on(DoctorHomePage.ADD_DOCTOR),
             Enter.theValue(info.getName()).into(DoctorHomePage.NAME_DOCTOR),
             Enter.theValue(info.getLastName()).into(DoctorHomePage.LAST_NAME_DOCTOR),
             Enter.theValue(info.getPhone()).into(DoctorHomePage.PHONE_DOCTOR),
             SelectFromOptions.byVisibleText(info.getDocumentType()).from(DoctorHomePage.LISTDOCUMENT),
             Enter.theValue(info.getDocumentNumber()).into(DoctorHomePage.DOCUMENT_NUMBER_DOCTOR),
             Click.on(DoctorHomePage.CLICK_GUARDAR));

    }
}
