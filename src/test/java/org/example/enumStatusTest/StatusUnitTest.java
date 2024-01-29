package org.example.enumStatusTest;

import org.example.emums.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static junit.framework.Assert.assertEquals;

public class StatusUnitTest {

    @Test
    public void testStatus(){
        Assertions.assertEquals("New", Status.NEW.getLabel());
        Assertions.assertEquals("Active", Status.ACTIVE.getLabel());
        Assertions.assertEquals("Complete", Status.COMPLETE.getLabel());
    }

    @ParameterizedTest
    @EnumSource (Status.class)
    public void testEnumLabels(Status status){
        assertEquals(status.getLabel().toUpperCase(), status.name());
    }
}
