import org.junit.Test;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import services.SomeService;
import services.impl.SomeServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockSomeModuleTest {

    private static final String TEST_STRING = "test_string";

    @Test
    public void validTestMock() {
        SomeService someService = mock(SomeServiceImpl.class);
        when(someService.getSomeString()).thenReturn(TEST_STRING);

        assertEquals(someService.getSomeString(), TEST_STRING);

        verify(someService).getSomeString();
    }

    @Test(expected = WantedButNotInvoked.class)
    public void invalidMockTest() {
        SomeService someService = mock(SomeServiceImpl.class);
        when(someService.getSomeString()).thenReturn(TEST_STRING);

        assertEquals(TEST_STRING, TEST_STRING);

        verify(someService).getSomeString();
    }
}
