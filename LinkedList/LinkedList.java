class LinkedList{
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAtPosition(int data, int index){
        Node newNode = new Node(data);

        if(head == null || index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;
        while(current != null && count < index-1){
            current = current.next;
            count++;
        }

        if(current == null){
            System.out.println("Invalid Position !");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void getFromIndex(int index){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node current = head;
        int count = 0;
        while(current != null && count <= index-1){
            current = current.next;
            count++;
        }
        if(current == null){
            System.out.println("Invalid Position !");
            return;
        }

        System.out.println(current.data);
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("Linked List is Empty ");
            return;
        }
        
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Linked List is Empty ");
            return;
        }

        if(head.next == null){
            head = null;
        }

        Node current = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            current= current.next;
            lastNode = lastNode.next;
        }
        current.next = null;
    }

    public void deleteFromPosition(int index){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }

        if(index == 0){
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        int count = 0;
        while( count <= index-1 && current != null){
            prev = current;
            current = current.next;
            count++;   
        }

        if(current == null){
            System.out.println("Invalid index");
            return;
        }

        prev.next = current.next;
    }

    public void printList(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node current = head;
        while(current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args){
        
        LinkedList list = new LinkedList();

        list.addFirst(7);
        list.printList();

        list.addLast(8);
        list.printList();

        list.insertAtPosition(9,2);
        list.printList();

        list.getFromIndex(2);

        list.deleteLast();
        list.printList();

        list.addLast(9);
        list.addLast(10);
        list.addLast(11);
        list.printList();

        list.deleteFromPosition(3);
        list.printList();
        

    }
}


