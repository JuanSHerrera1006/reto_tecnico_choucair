package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.builders.BusinessUnitGeneralInfoFormBuilder;
import co.com.choucair.certification.retotecnico.userinterface.BusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FillGeneraInfoBusinessUnitForm implements Task {

    private final String name;
    private final String parentBusinessUnitName;

    public FillGeneraInfoBusinessUnitForm(String name, String parentBusinessUnitName) {
        this.name = name;
        this.parentBusinessUnitName = parentBusinessUnitName;
    }
    public static BusinessUnitGeneralInfoFormBuilder forTheGeneralInfoOfABusinessUnit() {
        return new BusinessUnitGeneralInfoFormBuilder();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("Business Unit Name", name);
        actor.attemptsTo(
                Click.on(BusinessUnitPage.BTN_NEW_BUSINESS_UNIT),
                Enter.theValue(name).into(BusinessUnitPage.INPUT_NAME_UNIT),
                Click.on(BusinessUnitPage.CONTAINER_PARENT_BUSINESS_UNIT_INPUT),
                Enter.theValue(parentBusinessUnitName).into(BusinessUnitPage.PARENT_BUSINESS_UNIT_INPUT),
                Hit.the(Keys.ENTER).into(BusinessUnitPage.PARENT_BUSINESS_UNIT_INPUT),
                Click.on(BusinessUnitPage.BTN_ADD_BUSINESS_UNIT),
                Enter.theValue(name).into(BusinessUnitPage.INPUT_SEARCH_BUSINESS_UNIT),
                DoubleClick.on(BusinessUnitPage.BTN_FILTER_ID)
        );
    }
}
