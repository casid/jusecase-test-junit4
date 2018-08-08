package org.jusecase.test.junit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UsecaseExecutorTest extends org.jusecase.test.UsecaseExecutorTest {

    @Override
    protected void assertUsecaseMatches(Class<?> requestClass, Class<?> usecaseClass, Object usecase) {
        assertNotNull("No usecase was found for request '" + requestClass.getName() + "'", usecase);
        assertEquals(usecaseClass, usecase.getClass());
    }
}
