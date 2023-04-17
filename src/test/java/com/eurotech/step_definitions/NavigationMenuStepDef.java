package com.eurotech.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class NavigationMenuStepDef {

    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println("Welcome message is here");

    }
    @Then("The user navigates to Developers Menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("Navigates to developer menu");
    }
    @Then("The user able to see developer text")
    public void the_user_able_to_see_developer_text() {
        System.out.println("Developer text is here");
    }
    @Then("The user navigates to All Post Menu")
    public void the_user_navigates_to_all_post_menu() {

        System.out.println("Navigate to all post menu");
    }
    @Then("The user able to see Post text")
    public void the_user_able_to_see_post_text() {
        System.out.println("Post Text is here");
    }

    @And("The user navigates to Dashboard Menu")
    public void theUserNavigatesToDashboardMenu() {

        System.out.println("Navigate Dashboard Menu");
    }

    @Then("The user able to see Dashboard text")
    public void theUserAbleToSeeDashboardText() {
        System.out.println("Dashboard Text is here");
    }
}
