public class Main {
    public static void main(String[] args) {
        Node<String> task1 = new Node<String>("Creation of LinkedList.java");
        Node<String> task2 = new Node<String>("More methods in Node.java");

        task1.setNext(task2);
        System.out.println("Task 1: " + task1.getData());
        System.out.println("Task 2: " + task1.getNext().getData());
    }
}
