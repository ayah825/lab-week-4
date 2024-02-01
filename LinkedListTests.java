import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class LinkedListTests {
    @Test 
    public void testPrepend() {
        LinkedList list = new LinkedList();

        list.prepend(4);
        assertEquals(4, list.root.value);

        list.prepend(3);
        assertEquals(3, list.root.value);
        assertEquals(4, list.root.next.value);

        list.prepend(null);
        assertEquals(null, list.root.value);
        assertEquals(3, list.root.next.value);
        assertEquals(4, list.root.next.value);
    }
}
