package ar.fiuba.tdd.template;

public class LinkedQueue<T> implements Queue<T> {

    private SLList<T> list = new SLList<>( );

    public LinkedQueue( ) { }

    @Override
    public int size( ) {
        return list.size( );
    }

    @Override
    public boolean isEmpty( ) {
        return list.isEmpty( );
    }

    @Override
    public void add(T element) {
        list.addLast(element);
    }

    @Override
    public T top( ) {
        return list.first( );
    }

    @Override
    public void remove( ) {
        list.removeFirst( );
    }

}
