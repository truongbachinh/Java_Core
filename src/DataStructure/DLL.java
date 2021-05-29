package DataStructure;

public class DLL {
    Node head; // head of list.

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    // Adding a node at the front of the list -- chèn vào đầu
    public void push(int newData) {
        /* (1) Tạo nút mới, điều chỉnh 3 tham chiếu */
        Node newNode = new Node(newData);
        newNode.next = head;
        newNode.prev = null;
        /* (2). change prev of head node to new node */
        if (head != null) {
            head.prev = newNode;
        }
        /* (3). move the head to point to the new node */
        head = newNode;
    }
    // Add a node at the end of the list
    void append(int newData) {
        Node newNode = new Node(newData);
        Node last = head;
        /*  If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            head = newNode;
            return;
        }
        /* Else traverse till the last node */
        while (last.next != null) {
            last = last.next;
        }
        /*   Change the next of last node */
        last.next = newNode;
        /*   Change the next of last node */
        last.next = newNode;
    }
    /* Given a node as prev_node, insert a new node after the given node */
    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }



    // This function prints contents of
    // linked list starting from the given node
    public void printList(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.println(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.prev;
        }
    }

    /* Driver program to test above functions*/
    public static void main(String[] args) {
        /* Start with the empty list */
        DLL dll = new DLL();

        // Insert 6. So linked list becomes 6->NULL
        dll.append(6);
        // Insert 7 at the beginning. So
        // .. linked list becomes 7->6->NULL
        dll.push(7);

        // Insert 1 at the beginning. So
        // linked list becomes 1->7->6->NULL
        dll.push(1);

        // Insert 4 at the end. So linked
        // list becomes 1->7->6->4->NULL
        dll.append(4);
        // Insert 8, after 7. So linked
        // list becomes 1->7->8->6->4->NULL
        dll.insertAfter(dll.head.next, 8);

        System.out.println("Created DLL is: ");
        dll.printList(dll.head);
    }
}



