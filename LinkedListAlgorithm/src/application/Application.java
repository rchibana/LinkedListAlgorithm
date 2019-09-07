package application;

/**
 * Created by Rodrigo Chibana
 * Date: 04/09/2019
 **/
public class Application {

    static Node head;

    public static void main(String[] args) {

        head = new Node(null, "a");

        head = addNode(head, "b");
        head = addNode(head, "c");
        head = addNode(head, "d");
        head = addNode(head, "e");
        head = addNode(head, "f");
        head = addNode(head, "g");
        head = addNode(head, "h");
        head = addNode(head, "i");
        head = addNode(head, "j");
        head = addNode(head, "k");

        removeNode(head, "f");

        Node tempNode = head;

        while(tempNode.hasNext()) {
            System.out.println(tempNode.getContent());
            tempNode = tempNode.getNext();
        }

        System.out.println(tempNode.getContent());

    }

    public static Node addNode(Node currentNode, String content) {
        return new Node(currentNode, content);
    }

    public static void removeNode(Node node, String content) {

        Node tempNode = node;

        while(tempNode.hasNext() && !content.equalsIgnoreCase(tempNode.getNext().getContent())) {
            tempNode = tempNode.getNext();
        }

        // kicking one position
        if(tempNode.hasNext()) {
            tempNode.setNext(tempNode.getNext().getNext());
        }

    }

}
