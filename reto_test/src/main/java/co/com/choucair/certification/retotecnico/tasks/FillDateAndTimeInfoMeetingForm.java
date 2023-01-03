package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.builders.MeetingDateAndTimeInfoFormBuilder;
import co.com.choucair.certification.retotecnico.userinterface.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FillDateAndTimeInfoMeetingForm implements Task {

    private final String startDate;
    private final String endDate;
    private final String startTime;
    private final String endTime;

    public FillDateAndTimeInfoMeetingForm(String startDate, String endDate, String startTime, String endTime) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static MeetingDateAndTimeInfoFormBuilder forTheDateAndTimeOfAMeeting() {
        return new MeetingDateAndTimeInfoFormBuilder();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(startDate).into(MeetingPage.INPUT_START_DATE),
                Enter.theValue(endDate).into(MeetingPage.INPUT_END_DATE),
                SelectFromOptions.byValue(startTime).from(MeetingPage.DROPDOWN_START_DATE_TIME),
                SelectFromOptions.byValue(endTime).from(MeetingPage.DROPDOWN_END_DATE_TIME)
        );
    }
}
