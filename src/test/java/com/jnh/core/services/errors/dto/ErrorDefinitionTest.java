package com.jnh.core.services.errors.dto;

import org.junit.Assert;
import org.junit.Test;

import com.jnh.core.AbstractPojoTester;

public class ErrorDefinitionTest extends AbstractPojoTester {

    /**
     * Constructor.
     */
    public ErrorDefinitionTest() {
        this.addTestValue(ErrorId.class, new ErrorId());
    }

    /**
     * Test getter and setter methods from a class.
     */
    @Test
    public void testGettersAndSetters() {
        testPojo(ErrorDefinition.class);
    }

    @Test
    public void checkConstructor() {
        ErrorId errorId = new ErrorId();
        String name = "Name";
        String txt = "TXT";
        String httpCode = "100";
        ErrorDefinition errorDefinition = new ErrorDefinition(errorId, name,
                txt, httpCode);
        Assert.assertEquals(name, errorDefinition.getName());
        Assert.assertEquals(txt, errorDefinition.getTxt());
        Assert.assertEquals(httpCode, errorDefinition.getHttpStatusCode());
        Assert.assertEquals(errorId, errorDefinition.getErrorId());
    }
}
