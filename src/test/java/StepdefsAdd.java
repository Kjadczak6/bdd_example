import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepdefsAdd {
    public Integer result;
    @Given("^I have two numbers to add$")
    public void iHaveTwoNumbersToAdd() {
    }

    @And("^thinking about answer$")
    public void iThinkingAboutAnswer() {
    }

    @When("^I add \"([^\"]*)\" to \"([^\"]*)\"$")
    public void iAddTo(Integer firstNumber, Integer secondNumber) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        result = Calc.Adding(firstNumber,secondNumber);

        //throw new PendingException();
    }

    @Then("^Answer should be \"([^\"]*)\"$")
    public void answerShouldBe(Integer ans) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        assertEquals(ans, result);

        //throw new PendingException();
    }
}
