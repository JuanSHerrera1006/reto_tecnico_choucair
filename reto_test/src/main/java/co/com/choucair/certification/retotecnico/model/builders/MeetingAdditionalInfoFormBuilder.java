package co.com.choucair.certification.retotecnico.model.builders;

import co.com.choucair.certification.retotecnico.tasks.FillAdditionalInfoMeetingForm;
import net.serenitybdd.screenplay.Tasks;

public class MeetingAdditionalInfoFormBuilder {

    private String location;
    private String businessUnit;
    private String organizer;
    private String reporter;

    public MeetingAdditionalInfoFormBuilder inTheLocation(String location) {
        this.location = location;
        return this;
    }

    public MeetingAdditionalInfoFormBuilder withTheBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    public MeetingAdditionalInfoFormBuilder organizedBy(String organizer) {
        this.organizer = organizer;
        return this;
    }

    public MeetingAdditionalInfoFormBuilder reportedBy(String reporter) {
        this.reporter = reporter;
        return this;
    }

    public FillAdditionalInfoMeetingForm withTheAttendee(String attendee) {
        return Tasks.instrumented(
                FillAdditionalInfoMeetingForm.class,
                location,
                businessUnit,
                organizer,
                reporter,
                attendee
        );
    }
}
