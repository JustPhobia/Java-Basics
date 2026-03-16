package Module2.TaskManagerExercise;

import java.util.Date;

public class Task {
    private String title;
    private String description;
    private Date dueDate;
    private boolean status = false;
    private int priority;

    public Task(String title, String description, Date dueDate, int priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        if (status) {
            return "Completed";
        }else{
            return "In Progress";
        }
    }

    public void setStatus(boolean status) {
        if (status != this.status) {
            this.status = status;
        }else{
            System.out.println("Status is already set");
        }
    }

    @Override
    public String toString() {
        return "| Priority: "+ getPriority() +"\t| Title: " +getTitle() +"\t| Description: " + getDescription() + "\t| status: "+ getStatus();
    }
}
