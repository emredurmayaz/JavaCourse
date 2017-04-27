public class TestMyHeap2 
{
    public static void main(String[] args) 
    {
        MyHeap mh = new MyHeap();

        mh.insert(4);
        mh.insert(5);
        mh.insert(6);
        mh.insert(15);
        mh.insert(9);
        mh.insert(7);
        mh.insert(20);
        mh.insert(16);
        mh.insert(25);
        mh.insert(14);
        mh.insert(12);
        mh.insert(11);
        mh.insert(13);

        System.out.println("Initial heap : ");
        mh.printHeap();

        int removedItem = mh.deleteMin();
        System.out.println("Removed Item : " + removedItem);
        
        System.out.println("After removing : ");
        mh.printHeap();
    }
}