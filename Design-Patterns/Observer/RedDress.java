import java.util.ArrayList;
import java.util.List;

public class RedDress implements Observable {

    private List<Observer> observerList =  new ArrayList<>();
    private boolean available;

    public RedDress() {

    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if(available == true) {
            notifyInStock();
        } else if(available == false) {
            notifyOutOfStock();
        }
    }

    public void notifyInStock() {
        observerList.forEach(consumer -> consumer.sendInStockMsg());
    }

    @Override
    public void notifyOutOfStock() {
        observerList.forEach(consumer -> consumer.sendOutOfStockMsg());
    }

    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    public void addObserver(Observer o) {
        observerList.add(o);
    }

}
