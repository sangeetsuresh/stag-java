package com.vimeo.integration_test_android;

import org.junit.Test;

/**
 * Unit tests for {@link TestModel}.
 */
public class TestModelTest {

    @Test
    public void verifyTypeAdapterWasGenerated() throws Exception {
        Utils.verifyTypeAdapterGeneration(TestModel.class);
    }
}