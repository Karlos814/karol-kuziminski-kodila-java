package kodillagoodpatterns2.observer.homework;

public class Mentor implements ObserverMentor {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Tasks tasks) {
        System.out.println((username+ " has a new task from "+tasks.getUsername()+
                " (total: "+tasks.getTaskList().size()+" tasks"));
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
