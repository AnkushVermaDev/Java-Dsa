class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

    public Node() {
        //TODO Auto-generated constructor stub
    }



}


class ListManager{
    Node head=null;
    Node tail=null;
    void addlast(int data){
        Node node =new Node(data);
        if (head==null) {
            head=node;
            tail=node;
        }
        else{
           
            tail.next=node;
            tail=node;
           
        }
    }


    void show(){
    Node currentNode=head;
    while (currentNode!=null) {
        System.out.println(currentNode.data);
        currentNode=currentNode.next;
    }
}


void frontadd(int data){
    Node node =new Node(data);
    node.next=head;
    head=node;

}

void removefirst(){
    
    Node mynode =head;
    head=mynode.next;
    mynode=null;

}



}



public class SingleLinkList {
    public static void main(String[] args) {
        
        ListManager manager=new ListManager();
        manager.addlast(12);
        manager.addlast(24);
        manager.frontadd(88);
        manager.frontadd(66);
        manager.removefirst();

        manager.show();
    
    
    }
}
