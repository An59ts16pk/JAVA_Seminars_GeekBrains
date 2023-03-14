package SemOOP_DZ_04;

public class Task<T> {
    
    private int id;
    private String createDate;
    private String createTime;
    private T notation;
    private String priority;
    private String deadline;
    private String author;

    public Task(int id) {
        this.id = id;
        this.createDate = null;
        this.createTime = null;
        this.notation = null;
        this.priority = null;
        this.deadline = null;
        this.author = null;
    }

    // public Task() {
    // }

    
    public int getID() {
        return id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public T gertNotation() {
        return notation;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getAuthor() {
        return author;
    }

    // public void setID(int id) {
    //     this.id = id;
    // }
    
    public Task<T> setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    public Task<T> setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    
    public Task<T> setNotation(T notation) {
        this.notation = notation;
        return this;
    }

    public Task<T> setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public Task<T> setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }

    public Task<T> setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public String toString() {
        return String.format("id=%d, creatDateTime: %s %s, task: '%s', priority: %s -> deadline: %s, avtor: %s",
         id, createDate, createTime, notation, priority, deadline, author);
    }

}
