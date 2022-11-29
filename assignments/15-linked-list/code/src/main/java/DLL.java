public class DLL{
    private Node head;
    private int size;

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.next = null;
        node.prev = last;
        size++;
    }

    public void insert(int after, int value){
        Node before = find(after);
        Node node = new Node(value);

        if(before == null){
            System.out.println("Doesn't exist");
            return;
        }
        node.next = before.next;
        node.prev = before;
        before.next = node;

        if(node.next != null){
            node.next.prev = node;
        }
        size++;
    }

    public Node find(int value){
        Node node = head;
        for(int i=0;i<size;i++){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val +" -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayInReverse(){
        Node node = head;
        Node last = null;
        while(node.next != null){
            node = node.next;
            last = node;
        }
        while(last != null){
            System.out.print(last.val +" <- ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}