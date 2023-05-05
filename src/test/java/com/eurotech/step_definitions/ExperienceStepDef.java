package com.eurotech.step_definitions;

import com.eurotech.pages.ExperiencePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ExperienceStepDef {

    ExperiencePage experiencePage = new ExperiencePage();
    @Then("The user should land on Add An Experience page")
    public void theUserShouldLandOnAddAnExperiencePage() {
        String expectedHeader = "Add An Experience";
        String actualHeader = experiencePage.header.getText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }

}
