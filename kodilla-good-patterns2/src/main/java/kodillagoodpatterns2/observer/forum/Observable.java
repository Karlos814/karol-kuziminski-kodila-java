package kodillagoodpatterns2.observer.forum;

public interface Observable {
    void registerObserver(Observer observer);
    void notIfObservers();
    void removeObserver(Observer observer);
}
