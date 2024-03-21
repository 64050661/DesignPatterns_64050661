import java.util.ArrayList;
import java.util.List;

// นายวฤษณิ์ ทับทิม 64050661
public abstract class Source {
    private final List<Observer> list = new ArrayList<>();

    public void add(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(list.indexOf(observer));
    }

    public void notifyObservers() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update(this);
        }
    }
}
