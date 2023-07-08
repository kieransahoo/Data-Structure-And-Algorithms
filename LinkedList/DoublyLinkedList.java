public class DoublyLinkedList {
    Node head;
    Node tail;


    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        
    }



    public void printList() {
        Node current = head;
        System.out.print("List: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void removeByIndex(int index) {
        if (index < 0 )
            throw new IndexOutOfBoundsException("Invalid index!");

        if (index == 0) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
        }else {
            Node current = head;
            int count = 0;

            while (count < index) {
                current = current.next;
                count++;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.printList();

        dll.removeByIndex(1);
        dll.printList();
    }
}
