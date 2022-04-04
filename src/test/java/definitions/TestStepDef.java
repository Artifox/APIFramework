package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestStepDef {
    @Given("I write hello world in Given")
    public void iWriteHelloWorldInGiven() {
        System.out.println("Hello world from Given");
    }


    @When("I read {string} from When")
    public void iReadFromWhen(String string) {
        System.out.println(string + " from When");
    }

    @Then("I write success from Then")
    public void iWriteSuccessFromThen() {
        Assert.fail();
        System.out.println("Success from Then");
    }
}
