package co.com.choucair.certification.hospital.stepdefinitions;

import co.com.choucair.certification.hospital.model.DataTable;
import co.com.choucair.certification.hospital.model.DataTablePatient;
import co.com.choucair.certification.hospital.model.DataTableSchedule;
import co.com.choucair.certification.hospital.questions.TheAnswer;
import co.com.choucair.certification.hospital.questions.TheAnswerPatient;
import co.com.choucair.certification.hospital.questions.TheAnswerSchedule;
import co.com.choucair.certification.hospital.tasks.AddPatient;
import co.com.choucair.certification.hospital.tasks.OpenUp;
import co.com.choucair.certification.hospital.tasks.AddDoctor;
import co.com.choucair.certification.hospital.tasks.ScheduleAppointment;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ManageAppointment {



    @Given("^that carlos needs to register a new doctor$")
    public void thatCarlosNeedsToRegisterANewDoctor()  {

        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.pageHospital());
    }

    @When("^he registers it in the Hospital Administration application$")
    public void heRegistersItInTheHospitalAdministrationApplication(List<DataTable> dataTable)  {
        OnStage.theActorInTheSpotlight().attemptsTo(AddDoctor.doctor(dataTable));
    }

    @Then("^he verifies that Doctor the message (.*)$")
    public void heVerifiesThatDoctorTheMessageDataSavedCorrectlyAppearsOnTheScreen(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswer.is(question)));
    }

    @Given("^that carlos needs to register a new patient$")
    public void thatCarlosNeedsToRegisterANewPatient()  {

        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.pageHospital());
    }

    @When("^carlos registers it in the Hospital Administration application$")
    public void carlosRegistersItInTheHospitalAdministrationApplication(List<DataTablePatient> dataTablePatient)  {
        OnStage.theActorInTheSpotlight().attemptsTo(AddPatient.in(dataTablePatient));

    }

    @Then("^he verifies that message (.*)$")
    public void heVerifiesThatTheMessageDataSavedCorrectlyAppearsOnTheScreen(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswerPatient.is(question)));

    }

    @Given("^that carlos needs go to the doctor$")
    public void thatCarlosNeedsGoToTheDoctor()  {
        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.pageHospital());

    }

    @When("^he schedule an appointment$")
    public void heScheduleAnAppointment(List<DataTableSchedule> dataTableSchedule)  {
        OnStage.theActorInTheSpotlight().attemptsTo(ScheduleAppointment.in(dataTableSchedule));

    }

    @Then("^he verifies that the (.*)$")
    public void heVerifiesThatTheMessageDataSavedCorrectlyIsDisplayed(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswerSchedule.is(question)));


    }

}
