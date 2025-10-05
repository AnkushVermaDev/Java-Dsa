class maxelementsExceptions extends Exception {

    maxelementsExceptions(String msg) {
        super(msg);
    }

}

class Node {
    public int MAX_VALUE = 3;

    Node(int value) {
        this.data = value;
        this.prev = null;

    }

    int data;
    Node prev;
}

class Manager {
    Node head;
    Node tail;
    int count = 0;

    void push(int value) throws maxelementsExceptions {
        try {
            Node node = new Node(value);
            if (count > node.MAX_VALUE) {
                throw new maxelementsExceptions("max limit ");
            }

            if (head == null) {

                tail = node;
                head = node;

            }

            else {

                node.prev = head;
                head = node;
            }

            this.count++;

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    void pop() {
        Node node = head;
        head = node.prev;
        node = null;

    }

    void show() {
        Node currentnode = head;
        while (currentnode != null) {

            System.out.println(currentnode.data);
            currentnode = currentnode.prev;

        }

    }

}

public class CusomStacks {
    public static void main(String[] args) throws maxelementsExceptions {

        Manager manager = new Manager();

        manager.push(12);
        manager.push(23);
        manager.push(83);
        manager.push(12);
        manager.push(23);
        manager.push(83);

        manager.pop();
        manager.show();

    }
}
