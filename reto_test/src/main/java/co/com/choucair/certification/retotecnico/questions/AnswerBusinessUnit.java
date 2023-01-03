package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.userinterface.BusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerBusinessUnit implements Question {

    public static AnswerBusinessUnit itHasBeenCreated() {
        return new AnswerBusinessUnit();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String result = Text.of(BusinessUnitPage.NAME_BUSINESS_UNIT_FIELD).viewedBy(actor).asString();
        final String expected = actor.recall("Business Unit Name");
        return result.equals(expected);
    }
}
