package co.com.choucair.certification.retotecnico.model.builders;

import co.com.choucair.certification.retotecnico.tasks.FillDateAndTimeInfoMeetingForm;
import net.serenitybdd.screenplay.Tasks;

public class MeetingDateAndTimeInfoFormBuilder {
    private String startDate;
    private String endDate;
    private String startTime;


    public MeetingDateAndTimeInfoFormBuilder StartedOnDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public MeetingDateAndTimeInfoFormBuilder finishedOnDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public MeetingDateAndTimeInfoFormBuilder StartedOnTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public FillDateAndTimeInfoMeetingForm finishedOnTime(String endTime) {
        return Tasks.instrumented(
                FillDateAndTimeInfoMeetingForm.class,
                startDate,
                endDate,
                startTime,
                endTime
        );
    }
}
