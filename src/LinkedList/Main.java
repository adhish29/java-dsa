package LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.prepend(5);
        list.prepend(4);
        list.prepend(3);
        list.append(7);
        list.append(8);
        list.insert(12, 2);
        list.insert(100, 6);
        list.delete(4);
        list.print();
        list.update(19, 3);
        list.print();
        System.out.println(list.search(170));
        list.delete(4);
        list.print();
        list.printMiddle();
        list.clearList();
        list.print();
    }

}
