/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/16/2020
 * Time: 3:32 PM
 */
public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("Testing");

        MyLinkedList linkedList = new MyLinkedList(9);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4, 9);
        linkedList.add(4, 8);
        linkedList.printList();
    }
}
