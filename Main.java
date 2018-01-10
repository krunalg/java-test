import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /* Creating object of class linkedList */
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Singly Linked List Test\n");
        System.out.println("Enter integer element to insert");
        list.display();
        list.appendNode(1);
        list.display();
        list.appendNode(5);
        list.appendNode(6);
        list.appendNode(7);
        list.display();
        list.removeLatestElement();
        list.display();
        list.removeLatestElement();
        list.display();
        list.appendNode(9);
        list.display();
        list.removeLatestElement();
        list.display();
        list.appendNode(8);
        list.appendNode(6);
        list.appendNode(7);
        list.display();
        list.removeGraterValues(4);
        list.display();
    }
}