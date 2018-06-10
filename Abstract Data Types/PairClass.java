public class PairClass<E1, E2> implements Pair<E1, E2> {

    private E1 first;
    private E2 second;

    public PairClass(E1 f, E2 s) {
        this.first = f;
        this.second = s;
    }

    @Override
    public E1 getFirst() {
        return first;
    }

    @Override
    public E2 getSecond() {
        return second;
    }

    @Override
    public void setFirst(E1 e1) {
        this.first = e1;
    }

    @Override
    public void setSecond(E2 e2) {
        this.second = e2;
    }
}
