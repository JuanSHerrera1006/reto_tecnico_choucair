package co.com.choucair.certification.retotecnico.util;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AutomationHook {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
