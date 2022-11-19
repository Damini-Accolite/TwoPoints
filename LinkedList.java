public class LinkedList {
    Node head = null;

    LinkedList(){
        Node n = new Node(1);
        head = n;
        n.next=null;
        Node prev = n;
        for(int i=2;i<=12;i++){
            Node n2  = new Node(i);
            prev.next = n2;
            n2.next=null;
            prev = n2;
        }
        prev.next = head;
    }

    public Node getNode(int d){
        Node temp = head;
        int it = 12;
        while(it > 0) {
            if (d == temp.data) {
                return temp;
            }
            it--;
            temp = temp.next;
        }
        return null;
    }
}
