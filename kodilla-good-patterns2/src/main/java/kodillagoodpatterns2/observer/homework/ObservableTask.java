package kodillagoodpatterns2.observer.homework;

public interface ObservableTask {
    void registerObserver(ObserverMentor observer);
    void notIfObservers();
    void removeObserver(ObserverMentor observer);
}
