package LinkedList;
public class Main {
    public static void main(String args[])
    {
        System.out.println("Linked List");
        Node d = new Node(4);
        Node c = new Node(3, d);
        Node b = new Node(2, c);
        Node a = new Node(1, b);

        reverse(a);
        printList(a);

    }

    public static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    
}
