class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Manager {
    Node head;
    Node tail;

    void frontadd(int value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            node.prev = null;

            head.prev = node;
            head = node;
        }

    }

    void specificadd(int index, int value) {
        Node node = new Node(value);

        int count = 0;

        Node current = head;
        while (current != null && count < index) {

            current = current.next;
            count++;

        }

        Node nextNode = current.next; 
        node.next = nextNode;
        node.prev = current;
        current.next = node;

    }


    void deleteatfront(){
        Node node=head;
        head=node.next;
        node=null;
        

    }



    void show() {
        Node currentnode = head;
        while (currentnode != null) {
            System.out.println(currentnode.data);
            currentnode = currentnode.next;
        }
    }

}

public class DoubleLinklist {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.frontadd(12);
        manager.frontadd(24);
        manager.frontadd(45);

        manager.specificadd(1, 69);
        manager.deleteatfront();

        manager.show();

    }

}
