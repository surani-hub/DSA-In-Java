class CustomisedLinkedList{
    private Node head;
    private Node tail;
    private int size;

    CustomisedLinkedList(){
        this.size =0;
    }

    public int size(){
        this.size = size;
        return size;
    }

    public void addFirst(int val){
        Node first = new Node(val);
        first.next = head;
        head = first;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void addLast(int val){
        Node last = new Node(val);
        if(tail==null){
            addFirst(val);
            return;
        }
        tail.next = last;
        tail = last;
        size++;
    }

    public void add(int val, int index){
        if(index == 0){
            addFirst(val);
            return;
        }
        if(index == this.size){
            addLast(val);
            return;
        }
        if(index > this.size){
            System.out.println("can't be added to list ");
            throw new ArrayIndexOutOfBoundsException("index is greater than size of the list");
        }
        Node node = head;
        for(int i=1; i<index;i++){
            node = node.next;
        }
        Node newNode = new Node(val, node.next);
        node.next = newNode;
        size++;
    }

    public int deleteFirst(){
        Node first = head;
        if(first == null){
            System.out.println("list is empty");
            throw new NullPointerException("empty list");
        }
        int value = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }
        Node last = head;
        while(last.next.next != null){
            last = last.next;
        }
        int value = last.next.val;
        tail = last;
        size--;
        return value;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }

        Node prev = get(index -1);
        int value = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return value;
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

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int val;
        private Node next;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}