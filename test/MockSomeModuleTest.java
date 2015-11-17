import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import services.SomeService;
import services.impl.SomeServiceImpl;

import java.io.Serializable;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockSomeModuleTest {

    private static final String TEST_STRING = "test_string";
    private static final int TEST_INT = 1;

    @Mock
    private SomeService testSomeService;

    @Mock(extraInterfaces = Serializable.class)
    private SomeServiceImpl impl;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

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

    @Test
    public void testMockedService() {
        when(testSomeService.getSomeInt()).thenReturn(TEST_INT);

        assertEquals(testSomeService.getSomeInt(), TEST_INT);

        verify(testSomeService).getSomeInt();
//        verify(testSomeService).getSomeString();
    }

    @Test
    public void testSomeServiceWithImpl() {
        when(impl.getSomeInt()).thenReturn(anyInt());

        assertEquals(impl.getSomeInt(), anyInt());

//        assertThat(impl.getSomeInt(), eq(anyInt()));

        verify(impl).getSomeInt();
    }

}
