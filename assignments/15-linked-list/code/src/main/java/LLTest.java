class LLTest{
    public static void main(String[] args){
        CustomisedLinkedList list = new CustomisedLinkedList();

        //list.addFirst(10);

        list.addFirst(20);

        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);

        list.display();
		/*
		list.addLast(110);

		list.display();
		System.out.println(list.size());

		list.add(999, 0);
		list.display();
		*/
        System.out.println(list.size());
        //System.out.println(list.delete(2));
        list.find(40);
        System.out.println(list.size());

    }
}