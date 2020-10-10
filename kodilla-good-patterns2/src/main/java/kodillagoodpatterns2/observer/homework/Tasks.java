package kodillagoodpatterns2.observer.homework;


import kodillagoodpatterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class Tasks implements ObservableTask{
    private final List<ObserverMentor> mentors;
    private final List<Task> taskList;
    private final String username;

    public Tasks(String username) {
        mentors = new ArrayList<>();
        taskList = new ArrayList<>();
        this.username = username;
    }

    public void addTask(Task task){
        taskList.add(task);
        notIfObservers();
    }

    @Override
    public void registerObserver(ObserverMentor observer) {
        mentors.add(observer);
    }

    @Override
    public void notIfObservers() {
        for(ObserverMentor mentor : mentors){
            mentor.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverMentor observer) {
        mentors.remove(observer);
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public String getUsername() {
        return username;
    }
}
