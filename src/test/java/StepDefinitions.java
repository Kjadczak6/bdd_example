import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    public String waited;
    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Calc belly = new Calc();
        belly.eat(cukes);
       // throw new PendingException();
    }

    @When("^I wait \"([^\"]*)\" hour$")
    public void iWaitHour(Integer time) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        waited = Calc.IsItWaited(time);
    }

    @Then("^my belly should \"([^\"]*)\"$")
    public void myBellyShould(String growl) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(growl, waited);
    }
}
