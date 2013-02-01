package com.jnh.core.services.errors.dto;

import org.junit.Assert;
import org.junit.Test;

import com.jnh.core.AbstractPojoTester;

public class ErrorIdTest extends AbstractPojoTester {
    /**
     * Test getter and setter methods from a class.
     */
    @Test
    public void testGettersAndSetters() {
        testPojo(ErrorId.class);
    }

    @Test
    public void checkConstructor() {
        String category = "SVC";
        String identifier = "Identifier";
        ErrorId errorId = new ErrorId(category, identifier);
        Assert.assertEquals(category, errorId.getCategory());
        Assert.assertEquals(identifier, errorId.getId());
    }

    @Test
    public void checkToStringMethod() {
        ErrorId errorId = new ErrorId("SVC", "Identifier");
        Assert.assertEquals(
                "ErrorId [category=SVC, id=Identifier, descriptionPatter=null]",
                errorId.toString());
        errorId.setDescriptionPattern("**");
        Assert.assertEquals(
                "ErrorId [category=SVC, id=Identifier, descriptionPatter=**]",
                errorId.toString());
    }
}
