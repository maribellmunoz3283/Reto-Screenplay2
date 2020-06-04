package co.com.choucair.certification.hospital.questions;

import co.com.choucair.certification.hospital.userinterface.PatientHomePage;
import co.com.choucair.certification.hospital.userinterface.ScheduleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheAnswerSchedule implements Question<Boolean> {
    private String question;

    public TheAnswerSchedule (String question) {
        this.question = question;
    }
    public static TheAnswerSchedule is(String question) {
        return new TheAnswerSchedule(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;

        String answerSchedule = Text.of(ScheduleHomePage.THE_ANSWER_SCHEDULE).viewedBy(actor).asString();
        if (question.equals(answerSchedule)) {
            result = true;
        }else {
            result = false;
        }
        return result;

    }

}












