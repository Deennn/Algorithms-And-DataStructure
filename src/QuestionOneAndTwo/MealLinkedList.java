package QuestionOneAndTwo;


public class MealLinkedList {

    public static void main(String[] args) {
        Meal meal1 = new Meal("Garri", 2.00, 3.00, 4.00);
        Meal meal2 = new Meal("Maize", 2.00, 3.00, 4.00);
        Meal meal3 = new Meal("Cassava", 2.00, 3.00, 4.00);
        Meal meal4 = new Meal("Agbado", 2.00, 3.00, 4.00);

        MealLinkedList mealLinkedList = new MealLinkedList();
        mealLinkedList.add(meal4);
        mealLinkedList.add(meal1);
        mealLinkedList.add(meal2);
        mealLinkedList.add(meal3);
        mealLinkedList.add(meal2);


//        mealLinkedList.reverse();
        System.out.println(reverse(mealLinkedList.head));

//        System.out.println(find(mealLinkedList.head, meal1));
    }

    private Node head;
    int size;

    public static class Node<T> {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void add(Meal meal) {
        Node node  = new Node<>(meal);
        node.next = head;
        head = node;
        size++;
    }

    public static Node reverse(Node head) {
        Node current  = head;
        Node prev = null;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static int find(Node head, Meal meal) {
        if (head == null) return -1;

        Node current = head;
        while (current != null) {
            if (current.data.equals(meal)) return 1;
            current = current.next;
        }
        return -1;
    }


    @Override
    public String toString() {
        return "MealLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
