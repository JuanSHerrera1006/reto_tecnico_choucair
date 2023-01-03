package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Go implements Task {
    private Target menuSelected;
    private Target menuAction;

    public Go(Target menuSelected, Target menuAction) {
        this.menuSelected = menuSelected;
        this.menuAction = menuAction;
    }

    public static Go toBusinessUnit() {
        return Tasks.instrumented(
                Go.class, HomePage.BUSINESS_UNIT_MENU, HomePage.BUSINESS_UNIT_ACTION
        );
    }

    public static Go toMeetingPage() {
        return Tasks.instrumented(
                Go.class, HomePage.MEETING_MENU, HomePage.MEETING_ACTION
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(menuSelected),
                Click.on(menuAction)
        );
    }
}
