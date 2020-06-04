package co.com.choucair.certification.hospital.questions;

import co.com.choucair.certification.hospital.userinterface.DoctorHomePage;
import co.com.choucair.certification.hospital.userinterface.PatientHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswerPatient implements Question<Boolean> {
    private String question;

    public TheAnswerPatient (String question) {
        this.question = question;
    }
    public static TheAnswerPatient is(String question) {
        return new TheAnswerPatient(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

            boolean result;

            String answerPatient = Text.of(PatientHomePage.THE_ANSWER_PATIENT).viewedBy(actor).asString();
            if (question.equals(answerPatient)) {
                result = true;
            }else {
                result = false;
            }
            return result;

            }

        }


