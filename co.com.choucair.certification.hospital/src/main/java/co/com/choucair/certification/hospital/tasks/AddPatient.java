package co.com.choucair.certification.hospital.tasks;

import co.com.choucair.certification.hospital.model.DataTable;
import co.com.choucair.certification.hospital.model.DataTablePatient;
import co.com.choucair.certification.hospital.userinterface.PatientHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;


public class AddPatient implements Task {

    private  List<DataTablePatient> dataTablePatient;

    public AddPatient(List<DataTablePatient> dataTablePatient) {
        this.dataTablePatient = dataTablePatient;
    }

    public static AddPatient in(List<DataTablePatient> dataTablePatient) {
        return Tasks.instrumented(AddPatient.class, dataTablePatient);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        DataTablePatient info = dataTablePatient.get(0);

        actor.attemptsTo(Click.on(PatientHomePage.ADD_PATIENT),
                Enter.theValue(info.getName()).into(PatientHomePage.NAME_PATIENT),
                Enter.theValue(info.getLastName()).into(PatientHomePage.LAST_NAME_PATIENT),
                Enter.theValue(info.getPhone()).into(PatientHomePage.PHONE_PATIENT),
                SelectFromOptions.byVisibleText(info.getDocumentType()).from(PatientHomePage.LISTDOCUMENT),
                Enter.theValue(info.getDocumentNumber()).into(PatientHomePage.DOCUMENT_NUMBER_PATIENT),
                Click.on(PatientHomePage.CHECKBOX),Click.on(PatientHomePage.BOTTON_SAVE)
        );

    }
}