package co.com.choucair.certification.hospital.questions;

import co.com.choucair.certification.hospital.userinterface.DoctorHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswer implements Question<Boolean> {
    private String question;

    public TheAnswer (String question) {
       this.question = question;

    }

    public static TheAnswer is(String question) {
        return new TheAnswer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String answerDoctor = Text.of(DoctorHomePage.ANSWER_DOCTOR).viewedBy(actor).asString();
        if (question.equals(answerDoctor)) {
            result = true;
        }else {
            result = false;
        }
        return result;



    }


    }

