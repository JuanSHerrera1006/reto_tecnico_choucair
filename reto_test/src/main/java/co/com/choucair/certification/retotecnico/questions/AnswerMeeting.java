package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerMeeting implements Question {

    private String question;

    public AnswerMeeting(String question) {
        this.question = question;
    }

    public static AnswerMeeting toThe(String question) {
        return new AnswerMeeting(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String result = Text.of(HomePage.POPUP_SUCCESS).viewedBy(actor).asString();
        final String expected = question;
        return result.equals(expected);
    }
}
