package SemOOP_DZ_04;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task<T> {
    
    private int id;
    private LocalDate createDate;
    private LocalTime createTime;
    private T notation;
    private int priority;
    private LocalDate deadline;
    private String author;

    public Task(int id) {
        this.id = id;
        this.createDate = null;
        this.createTime = null;
        this.notation = null;
        this.priority = 0;
        this.deadline = null;
        this.author = null;
    }

    // public Task() {
    // }

    
    public int getID() {
        return id;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalTime getCreateTime() {
        return createTime;
    }

    public T gertNotation() {
        return notation;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getAuthor() {
        return author;
    }

    // public void setID(int id) {
    //     this.id = id;
    // }
    
    public Task<T> setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
        return this;
    }

    public Task<T> setCreateTime(LocalTime createTime) {
        this.createTime = createTime;
        return this;
    }
    
    public Task<T> setNotation(T notation) {
        this.notation = notation;
        return this;
    }

    public Task<T> setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public Task<T> setDeadline(LocalDate deadline) {
        this.deadline = deadline;
        return this;
    }

    public Task<T> setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public String toString() {
        return String.format("id=%d, creatDateTime: %s %s, task: '%s', priority: %d -> deadline: %s, avtor: %s",
         id, createDate, createTime, notation, priority, deadline, author);
    }

}
