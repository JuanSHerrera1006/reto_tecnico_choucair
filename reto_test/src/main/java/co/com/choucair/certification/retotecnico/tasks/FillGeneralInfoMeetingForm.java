package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.builders.MeetingGeneralInfoFormBuilder;
import co.com.choucair.certification.retotecnico.userinterface.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FillGeneralInfoMeetingForm implements Task {

    private final String name;
    private final String type;
    private final String number;

    public FillGeneralInfoMeetingForm(String name, String type, String number) {
        this.name = name;
        this.type = type;
        this.number = number;
    }

    public static MeetingGeneralInfoFormBuilder forTheGeneralInfoOfAMeeting() {
        return new MeetingGeneralInfoFormBuilder();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MeetingPage.BTN_NEW_MEETING),
                Enter.theValue(name).into(MeetingPage.INPUT_MEETING_NAME),
                Enter.theValue(number).into(MeetingPage.INPUT_MEETING_NUMBER),
                Click.on(MeetingPage.CONTAINER_INPUT_MEETING_TYPE),
                Enter.theValue(type).into(MeetingPage.INPUT_MEETING_TYPE),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_MEETING_TYPE)
        );
    }
}
