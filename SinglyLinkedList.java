/**
 * Created on 1/10/2018.
 */
public class SinglyLinkedList {
    protected Node startNode;
    protected Node endNode;
    public int size;

    public SinglyLinkedList() {
        startNode = null;
        endNode = null;
        size = 0;
    }

    /*Function to append an element into the linkedlist*/
    public void appendNode(int val) {
        Node node = new Node(val, null);
        size++;
        if (startNode == null) {
            startNode = node;
            endNode = startNode;
        } else {
            endNode.setLink(node);
            endNode = node;
        }
    }

    /*Function to remove the tail element from a linkedlist*/
    public void removeLatestElement() {
        Node s = startNode;
        Node t = startNode;
        while (s != endNode) {
            t = s;
            s = s.getLink();
        }
        endNode = t;
        endNode.setLink(null);
        size--;
        return;
    }

    /*Function to remove all element in the linkedlist that is greater than a target value*/
    public void removeGraterValues(int targetValue) {
        Node temp = startNode, prev = null;
        while (temp != null && temp.data > targetValue) {
            startNode = temp.link;
            temp = startNode;
        }
        while (temp != null) {
            while (temp != null && temp.data <= targetValue) {
                prev = temp;
                temp = temp.link;
            }
            if (temp == null) return;
            prev.link = temp.link;
            temp = prev.link;
        }
    }


    /*  Function to display elements  */
    public void display() {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) {
            System.out.print("Empty Linked List\n");
            return;
        }
        if (startNode.getLink() == null) {
            System.out.println(startNode.getData());
            return;
        }
        Node currentNode = startNode;
        System.out.print(startNode.getData() + ", ");
        currentNode = startNode.getLink();
        while (currentNode.getLink() != null) {
            System.out.print(currentNode.getData() + ", ");
            currentNode = currentNode.getLink();
        }
        System.out.print(currentNode.getData() + "\n");
    }
}
