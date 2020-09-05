public interface Observable {

    void notifyInStock();
    void notifyOutOfStock();
    void removeObserver(Observer o);
    void addObserver(Observer o);
}