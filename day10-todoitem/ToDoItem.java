public class ToDoItem {
    private String taskName;
    private int priority;
    private boolean completion;

    public ToDoItem(String taskName, int priority, boolean completed) {
        this.taskName = taskName;
        try{
        if (priority < 1 || priority > 5) { 
            throw new Exception("Priority must be between 1-5");  
        };
        this.priority = priority;
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
        this.completion = false;
    }
    public void setName(String newTaskName) {
        taskName = newTaskName;
    }
    public void setPriority(int newPriority) {
        priority = newPriority;
    }
    public void setCompletion() {
        if (completion == false) completion = true;
        else completion = false;
    }
    public String getTaskName() {
        return taskName;
    }
    public int getPriority() {
        return priority;
    }
    public boolean getCompletion() {
        return completion;
    }
    public String toString() {
        return taskName + ": Priority: " + priority + ": Completed: " + completion;
    }
    public String higherPriority(ToDoItem other) {
        if (this.priority > other.priority) return this.taskName;
        else return other.taskName;
    }
}
