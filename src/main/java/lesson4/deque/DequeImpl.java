package lesson4.deque;
import lesson4.LinkedList;
import lesson4.LinkedQueue;
import lesson4.TwoSideLinkedList;
import lesson4.TwoSideLinkedListImpl;

public class DequeImpl<E> implements Deque<E> {

    private final TwoSideLinkedList<E> data;

    public DequeImpl() {
        this.data = new TwoSideLinkedListImpl<>();
    }

    @Override
    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return data.removeFirst();
    }

    @Override
    public E removeRight() {
        E last = data.getLast();
        data.remove(last);
        return last;
    }

    @Override
    public boolean insert(E value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E peekFront() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }
}
