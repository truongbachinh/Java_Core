package DataStructure;


public class StackAsLinkedList {
    StackNode root; // Đỉnh / đối với stack chỉ tập trung vào đỉnh và sử lý thông qua đỉnh

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop()
                + " popped from stack");

        sll.push(40);

        System.out.println("Top element is " + sll.peek());
    }
}

