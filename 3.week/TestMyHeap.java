public class TestMyHeap 
{
    public static void main(String[] args) 
    {
        MyHeap mh = new MyHeap();
		
        mh.insert(13);
        mh.insert(21);
        mh.insert(16);
        mh.insert(24);
        mh.insert(31);
        mh.insert(19);
        mh.insert(68);
        mh.insert(65);
        mh.insert(26);
        mh.insert(32);

        System.out.println("Initial heap : ");
        mh.printHeap();

        mh.insert(14); 

        System.out.println("After inserting 14 : ");
        mh.printHeap(); 
    }
}
