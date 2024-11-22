public class LinkedList<T> {
    private Node<T> head = null; // at the start the head is set to nothing

    public void addTask(String description, String priority) {
        Node<String> task1 = new Node<String>(description, priority);
    }

    public void removeTask(int index) {

    }

    public void displayTasks() {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            System.out.println(index + ": " + current.getData());
            current = current.getNext();
            index++;
        }
    }
}
