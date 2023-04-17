package com.eurotech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setup(){
        System.out.println("This is coming from before");
    }

    @After
    public void tearDown(){
        System.out.println("This is coming from after method");
    }

    @Before("@db")
    public void setupDB(){
        System.out.println("This is coming from before DB");
        System.out.println("Connecting Database");
    }

    @After("@db")
    public void tearDownDB(){
        System.out.println("This is coming from after DB");
        System.out.println("Disconnecting Database");
    }

}
