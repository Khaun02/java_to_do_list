import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        LinkedList toDoList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to To-Do List Manager!\n" + //
                        "1. Add Task\n" + //
                        "2. Remove Task\n" + //
                        "3. View Tasks\n" + //
                        "4. Update Task\n" + //
                        "5. Mark Task as Completed\n" + //
                        "6. Sort Tasks by Priority\n" + //
                        "7. Exit\n" + //
                        "Enter your choice:");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        switch (choice) {
            case 1:
                System.out.println("Input description of task:");
                System.out.println("Input high, medium, or low for task:");
                String description = scanner.nextLine();
                String priority = scanner.nextLine();
                toDoList.addTask(description, priority);
                break;
            case 2:
                
                break;
            case 3:
                toDoList.displayTasks();
                break;
            case 7:
                System.out.println("Exiting program. Goodbye!");
                scanner.close();
                return;  // Exit the program
            default:
                break;
            }
        }
        
    }
}
