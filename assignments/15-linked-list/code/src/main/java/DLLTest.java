public class DLLTest{
    public static void main(String[] args){
        DLL list = new DLL();

        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        list.display();
        list.insert(40, 999);
        list.display();
    }
}
