package dubbo.mockito;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.And;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.matchers.StartsWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MockitoTest {

    @Test
    public void testBehaviour() {
        List mockedList = mock(List.class);
        mockedList.add("one");
        System.out.println(mockedList.get(0));
        mockedList.clear();
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    public void testStubbing() {
        //You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);

        //stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        //following prints "first"
        System.out.println(mockedList.get(0));

        //following throws runtime exception
//        System.out.println(mockedList.get(1));

        //following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));

        //Although it is possible to verify a stubbed invocation, usually it's just redundant
        //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
        //If your code doesn't care what get(0) returns, then it should not be stubbed. Not convinced? See here.
        verify(mockedList).get(0);
    }

    @Test
    public void testParams() {
        //You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);
        //stubbing using built-in anyInt() argument matcher
        when(mockedList.get(anyInt())).thenReturn("element");

        //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
//        when(mockedList.contains(argThat(new Equals(199)))).thenReturn(Boolean.valueOf("element1"));

        //following prints "element"
        System.out.println(mockedList.get(199));

        //you can also verify using an argument matcher
        verify(mockedList).get(anyInt());
    }
}