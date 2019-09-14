package Comparable_2;

public class CountedElement<E extends Comparable<E>> implements Comparable<CountedElement<E>> {

    private E element;

    public CountedElement(E e) {
        this.element = e;
    }

    public E getElement() {
        return element;
    }

    @Override
    public int compareTo(CountedElement<E> o) {
        return getElement().compareTo(o.getElement());
    }
}
