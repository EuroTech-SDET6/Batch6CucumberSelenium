package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setup(){
     //   Driver.get().manage().window().maximize();  //optional
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(){

        Driver.closeDriver();
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
