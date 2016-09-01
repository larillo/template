package ar.fiuba.tdd.template;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTests {

    private LinkedQueue<Integer> que = new LinkedQueue<>();

    @Test(expected = NoSuchElementException.class)
    public void emptyQueueRemove() {
        que.remove();
    }

    @Test(expected = NoSuchElementException.class)
    public void emptyQueueTop() {
        que.top();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(que.isEmpty());
    }

    @Test
    public void testIsEmpty1() {
        que.add(23);
        assertEquals(false, que.isEmpty());
    }

    @Test
    public void testIsEmpty2() {
        que.add(23);
        que.add(74);
        que.remove();
        que.remove();
        assertTrue(que.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, que.size());
    }

    @Test
    public void testSize1() {
        que.add(39);
        assertEquals(1, que.size());
    }

    @Test
    public void testSize2() {
        que.add(39);
        que.add(15);
        que.add(92);
        assertEquals(3, que.size());
    }

    @Test
    public void testTop() {
        que.add(39);
        assertEquals((Integer)39, que.top());
    }

    @Test
    public void testTop1() {
        que.add(39);
        que.add(63);
        que.remove();
        assertEquals((Integer)63, que.top());
    }

    @Test
    public void testAddRemove() {
        que.add(39);
        que.add(97);
        que.add(24);
        que.remove();
        que.remove();
        assertEquals(1, que.size());
        assertEquals((Integer)24, que.top());
    }

}
