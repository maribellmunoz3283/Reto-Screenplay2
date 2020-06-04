package co.com.choucair.certification.hospital.tasks;

import co.com.choucair.certification.hospital.userinterface.HospitalHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenUp  implements Task {

    private HospitalHomePage hospitalHomePage;

    public static OpenUp pageHospital() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(hospitalHomePage));
    }
}


