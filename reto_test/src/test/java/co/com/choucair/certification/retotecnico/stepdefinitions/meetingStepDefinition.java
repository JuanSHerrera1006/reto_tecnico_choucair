package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.questions.AnswerMeeting;
import co.com.choucair.certification.retotecnico.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class meetingStepDefinition {
    @Given("I want to add a meeting")
    public void iWantToAddAMeeting() {
        OnStage
                .theActorCalled("I")
                .wasAbleTo(Go.toMeetingPage());
    }
    @When("I fill new meeting form")
    public void iFillNewMeetingForm() {
        OnStage
                .theActorInTheSpotlight()
                .attemptsTo(
                        FillGeneralInfoMeetingForm
                                .forTheGeneralInfoOfAMeeting()
                                .named("TEST MEETING")
                                .ofType("General")
                                .withTheNumber( "000000000000"),
                        FillDateAndTimeInfoMeetingForm
                                .forTheDateAndTimeOfAMeeting()
                                .startedOnDate("01/10/2023")
                                .finishedOnDate("01/10/2023")
                                .startedOnTime("09:00")
                                .finishedOnTime("09:30"),
                        FillAdditionalInfoMeetingForm
                                .forTheAdditionalInfoOfAMeeting()
                                .inTheLocation("On Site")
                                .withTheBusinessUnit("TEST_BUSINESS_UNIT")
                                .organizedBy("Alexander Russell")
                                .reportedBy("Alexis Lopez")
                                .withTheAttendee("Allison Bell")

                );
    }
    @Then("I should give the pop up with the message {string}")
    public void iShouldGiveThePopUpWithTheMessage(String question) {
        OnStage
                .theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(AnswerMeeting.toThe(question)));
    }

}
