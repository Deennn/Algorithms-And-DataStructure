
public class SinglyLinkedList {


    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        singlyLinkedList.head = new Node(10);

        Node second = new Node("aa");
        Node third = new Node(8);
        Node fourth = new Node(11);
//        singlyLinkedList.head.next = second;
//        second.next  =  third;
//        third.next = fourth;
//        singlyLinkedList.print();
//        singlyLinkedList.insertFirst(100);
//        singlyLinkedList.insertFirst(2345);
        singlyLinkedList.insertFirst(122);
        singlyLinkedList.insertLast(30);
        singlyLinkedList.insertLast(45);
        singlyLinkedList.insertAtPosition(20000, 1);
        singlyLinkedList.insertAtPosition(30000, 6);
        System.out.println( singlyLinkedList.length());

        System.out.println(singlyLinkedList);

    }

    private Node head;
    int count = 0;

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

    public void print() {
        int i = 0;
        var current = head;
        while( current != null) {
            System.out.println(current.data +  " is at position " + ++i);
            current = current.next;
        }
    }

    public int length() {
//        int count = 0;
//        Node current = head;
//        while (current != null) {
//            count++;
//            current = current.next;
//        }
//        return count;

        return count;

    }

    public void insertFirst(int value) {

        Node newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        count++;
    }

    public void insertLast(int value) {
        Node newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }
        count++;
    }


    public void insertAtPosition(int value, int position) {
        Node newNode = new Node<>(value);

        if (count < position) throw new IndexOutOfBoundsException("Fuck off too Large");

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = head;
            int i = 0;
            while (++i < position-1) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
        count++;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                '}';
    }
}
