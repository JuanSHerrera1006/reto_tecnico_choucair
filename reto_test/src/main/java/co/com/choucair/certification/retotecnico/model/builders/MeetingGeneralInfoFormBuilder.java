package co.com.choucair.certification.retotecnico.model.builders;

import co.com.choucair.certification.retotecnico.tasks.FillGeneralInfoMeetingForm;
import net.serenitybdd.screenplay.Tasks;

public class MeetingGeneralInfoFormBuilder {
    private String name;
    private String type;


    public MeetingGeneralInfoFormBuilder named(String name) {
        this.name = name;
        return this;
    }

    public MeetingGeneralInfoFormBuilder ofType(String type) {
        this.type = type;
        return this;
    }

    public FillGeneralInfoMeetingForm withTheNumber(String number) {
        return Tasks.instrumented(FillGeneralInfoMeetingForm.class, name, type, number);
    }
}
