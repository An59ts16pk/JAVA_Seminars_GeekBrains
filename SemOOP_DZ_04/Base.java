package SemOOP_DZ_04;

import java.util.List;

public interface Base<T> {
    public void add(T el);
    public List<T> getPlans();
    public T createPlan(int id);
}
