package org.jusecase.test.junit4;

import org.junit.Before;
import org.jusecase.VoidUsecase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VoidUsecaseTest<Request> extends org.jusecase.test.VoidUsecaseTest<Request> {
    protected VoidUsecase<Request> usecase;

    @Before
    @Override
    public void createRequest() {
        super.createRequest();
    }

    protected void whenRequestIsExecuted() {
        usecase.execute(request);
    }

    @Override
    protected void thenErrorIs(Throwable expected) {
        assertEquals(expected, error);
    }

    @Override
    protected void thenErrorIs(Class<? extends Throwable> expected) {
        assertEquals(expected, error.getClass());
    }

    @Override
    protected void thenErrorMessageIs(String expected) {
        assertNotNull("Expected error with message '" + expected + "', but nothing was thrown.", error);
        assertEquals(expected, error.getMessage());
    }
}
