package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {
        int age = 42;

        //final int age2 = 43;

        age = age +1;

        //long starsInTheGalaxy = 10000000000L;

        float weight = 15.5F;
        double weight2 = 16.4;


        System.out.println("age = " + age);
    }

    @Test
    public void workingWithStrings() {
        String firstname = "Sarah-Jane";
        String upperCaseFirstname = firstname.toUpperCase();
        upperCaseFirstname = firstname.replace("Sarah", "Mary");
    }
}
