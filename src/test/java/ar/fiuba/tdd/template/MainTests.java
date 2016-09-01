package ar.fiuba.tdd.template;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

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

}
