package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.builders.MeetingAdditionalInfoFormBuilder;
import co.com.choucair.certification.retotecnico.userinterface.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FillAdditionalInfoMeetingForm implements Task {

    private final String location;
    private final String businessUnit;
    private final String organizer;
    private final String reporter;
    private final String attendee;

    public FillAdditionalInfoMeetingForm(
            String location,
            String businessUnit,
            String organizer,
            String reporter,
            String attendee
    ) {
        this.location = location;
        this.businessUnit = businessUnit;
        this.organizer = organizer;
        this.reporter = reporter;
        this.attendee = attendee;
    }

    public static MeetingAdditionalInfoFormBuilder forTheAdditionalInfoOfAMeeting() {
        return new MeetingAdditionalInfoFormBuilder();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MeetingPage.CONTAINER_INPUT_LOCATION),
                Enter.theValue(location).into(MeetingPage.INPUT_LOCATION),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_LOCATION),
                Click.on(MeetingPage.CONTAINER_INPUT_ORGANIZED_BY),
                Enter.theValue(organizer).into(MeetingPage.INPUT_ORGANIZED_BY),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_ORGANIZED_BY),
                Click.on(MeetingPage.CONTAINER_INPUT_UNIT),
                Enter.theValue(businessUnit).into(MeetingPage.INPUT_UNIT),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_UNIT),
                Click.on(MeetingPage.CONTAINER_INPUT_REPORTER),
                Enter.theValue(reporter).into(MeetingPage.INPUT_REPORTER),
                Hit.the(Keys.ENTER).into(MeetingPage.INPUT_REPORTER),
                Click.on(MeetingPage.CONTAINER_ATTENDEE_LIST_INPUT),
                Enter.theValue(attendee).into(MeetingPage.ATTENDEE_LIST_INPUT),
                Hit.the(Keys.ENTER).into(MeetingPage.ATTENDEE_LIST_INPUT),
                Click.on(MeetingPage.BTN_APPLY_CHANGES)
        );
    }
}
