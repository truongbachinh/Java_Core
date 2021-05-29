package DataStructure.Stack_Queue_Extend_SLL;

public class _27_TB_Chinh_SLL {
    public static void main(String[] args) {

        System.out.println("----------- Stack process -----------");
        Stack st = new Stack();
        System.out.println("Push: 1");
        st = st.push(st, 1);
        System.out.println("Push: 2");
        st = st.push(st, 2);
        System.out.println("Push: 3");
        st = st.push(st, 3);
        System.out.println("Push: 4");
        st = st.push(st, 4);

        st.print(st);
        System.out.print("Pop: ");
        st.pop(st);

        System.out.println("----------- End -----------");
        System.out.println();

        System.out.println("----------- Queue process -----------");
        Queue qe = new Queue();
        qe = qe.enqueue(qe, 1);
        qe = qe.enqueue(qe, 2);
        qe = qe.enqueue(qe, 3);
        qe = qe.enqueue(qe, 4);
        qe.print(qe);
        System.out.print("DeQueue: ");
        qe.dequeue(qe);
    }
}

class Node {
    int data;
    Node next;

    Node(int _data) {
        this.data = _data;
        this.next = null;
    }

    Node(int _data, Node link) {
        this.data = _data;
        this.next = link;
    }
}

class SLL {

    Node head;

    public SLL insertFirstElement(SLL list, int data) {
        Node newNode = new Node(data);
        newNode.next = list.head;
        list.head = newNode;
        return list;
    }

    public SLL insertLastElement(SLL list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public void getLastElement(SLL list) {
        int popped = Integer.MIN_VALUE;
        if (list.head == null) {

            System.out.println("Empty");
        }
        Node last = list.head;
        while (last.next != null) {
            last = last.next;
            if (last.next == null) {
                popped = last.data;
                System.out.println(popped);
                break;
            }

        }
    }

    public void getFirstElement(SLL list) {
        int popped = Integer.MIN_VALUE;
        if (list.head == null) {
            System.out.println("Null");
            return;
        } else {
            popped = head.data;
            head = head.next;
            System.out.println(popped);
        }
    }

    public void printList(SLL list) {
        Node currNode = list.head;
        System.out.print("\nLinkedList: ");
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("\n");
    }
}

class Stack extends SLL {
    public Stack push(Stack list, int data) {
        super.insertLastElement(list, data);
        return list;
    }

    public Stack pop(Stack list) {
        super.getLastElement(list);
        return list;
    }


    public Stack print(Stack list) {
        super.printList(list);
        return list;
    }


}

class Queue extends SLL {
    public Queue enqueue(Queue list, int data) {
        super.insertLastElement(list, data);
        return list;
    }

        public Queue dequeue(Queue list) {
        super.getFirstElement(list);
        return list;
    }
    public Queue print(Queue list) {
        super.printList(list);
        return list;
    }
}







