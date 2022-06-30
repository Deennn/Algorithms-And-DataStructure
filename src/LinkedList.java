public class LinkedList {


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node<>(1);
        Node second = new Node<>(3);
        Node third = new Node<>(9);
        Node fourth = new Node<>(13);
        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println(linkedList);
        linkedList.printMethod();
    }

    private Node head;

    public static class Node<T> {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void printMethod() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + "   ......   ");
            current = current.next;
        }
        System.out.println("null");

    }

    @Override
    public String toString() {
        return "LinkedList[" +
                " head=" + head +
                ']';
    }
}
