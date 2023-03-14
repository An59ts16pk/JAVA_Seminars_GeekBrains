package SemOOP_DZ_04;

import java.util.ArrayList;
import java.util.List;

public class TaskBase<T> implements Base<Task<T>>{
    private List<Task<T>> tasks;

    public TaskBase(List<Task<T>> tasks) {
        this.tasks = tasks;
    }

    public TaskBase() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void add(Task<T> task) {
        this.tasks.add(task);
    }

    @Override
    public Task<T> createPlan(int id) {
        return new Task<T>(id);
    }

    @Override
    public List<Task<T>> getPlans() {
        return tasks;
    }
    
    
}
