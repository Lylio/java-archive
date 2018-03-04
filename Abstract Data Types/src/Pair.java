public interface Pair<E1, E2> {

    //Return first element of pair
    public E1 getFirst();

    //Return second element of pair
    public E2 getSecond();

    //Replace first element of pair
    public void setFirst(E1 e1);

    //Replace second element of pair
    public void setSecond(E2 e2);
}
