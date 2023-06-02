import java.util.Iterator;
// write your code here
public class Node implements Iterable<Node> {
    public Node next;
    public int data;
    public Node(Node next, int data){
        this.next=next;
        this.data=data;
    }
    public Node(int data){
        this.data=data;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
    public static class NodeIterator implements Iterator<Node>{
        private Node head;

        public NodeIterator(Node head){
            this.head=head;
        }

        @Override
        public boolean hasNext() {
            return this.head!=null;
        }

        @Override
        public Node next() {
            Node temp=head;
            head=head.next;
            return temp;
        }
    }
}
