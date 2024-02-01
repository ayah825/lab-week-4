import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test 
    public void testFilter() {
        StringCheck sc = new StringCheck();

        List<String> actual = new ArrayList();
        actual.add("hi");
        actual.add("bye");
        actual.add("good morning");

        List<String> expected = new ArrayList();
        expected.add("hi");
        expected.add("bye");

        assertEquals(expected ,ListExamples.filter(actual, sc));

    }

    @Test 
    public void testMerge() {
        StringCheck sc = new StringCheck();

        List<String> actual1 = new ArrayList();
        actual1.add("apple");
        actual1.add("grape");
        actual1.add("strawberry");

        List<String> actual2 = new ArrayList();
        actual2.add("apricot");
        actual2.add("bluberry");

        List<String> expected = new ArrayList();
        expected.add("apple");
        expected.add("apricot");
        expected.add("bluberry");
        expected.add("grape");
        expected.add("strawberry");
        
        assertEquals(expected ,ListExamples.merge(actual1, actual2));

    }
}
