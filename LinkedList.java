public class LinkedList<T> {
    private Node<T> head = null; // at the start the head is set to nothing

    public void addTask(String description, String priority) {
        Node<String> task = new Node<String>(description, priority);
        if (head == null) {
            head = (Node<T>) task;
        }
        else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();  // Move to the next node
            }
            current.setNext(task); // Add the new node to the end of the list
        }
    }

    public void removeTask(int index) {

    }

    public void displayTasks() {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            System.out.println("\t" + index + ": " + current.getData());
            current = current.getNext();
            index++;
        }
        System.out.println();
    }
}
