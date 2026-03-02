public class ToDoApp {
    public static void main(String[] args) {

        // Create valid ToDoItems
        ToDoItem task1 = new ToDoItem("Finish Java Midterm Practice", 5, false);
        ToDoItem task2 = new ToDoItem("Go to the Gym", 3, false);

        // Print tasks
        System.out.println("Initial Tasks:");
        System.out.println(task1);
        System.out.println(task2);

        System.out.println();

        // Toggle completion
        task1.setCompletion();
        System.out.println("After completing task1:");
        System.out.println(task1);

        System.out.println();

        // Change priority
        task2.setPriority(4);
        System.out.println("After updating task2 priority:");
        System.out.println(task2);

        System.out.println();

        // Compare priorities
        String higher = task1.higherPriority(task2);
        System.out.println("Higher priority task: " + higher);

        System.out.println();

        // Test invalid priority 
        ToDoItem task3 = new ToDoItem("Invalid Task", 7, false);
        System.out.println(task3);  
    }
}