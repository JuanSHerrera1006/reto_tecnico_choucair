package co.com.choucair.certification.retotecnico.model.builders;

import co.com.choucair.certification.retotecnico.tasks.FillGeneraInfoBusinessUnitForm;
import net.serenitybdd.screenplay.Tasks;

public class BusinessUnitGeneralInfoFormBuilder {
    private String name;
    public BusinessUnitGeneralInfoFormBuilder named(String name) {
        this.name = name;
        return this;
    }
    public FillGeneraInfoBusinessUnitForm withTheParentBusinessUnit(String parentBusinessUnitName) {
        return Tasks.instrumented(FillGeneraInfoBusinessUnitForm.class, name, parentBusinessUnitName);
    }
}
