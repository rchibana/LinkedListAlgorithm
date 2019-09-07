package application;

/**
 * Created by Rodrigo Chibana
 * Date: 04/09/2019
 **/
public class Node {

    private Node next;
    private String content;

    public Node(Node next, String content) {
        this.next = next;
        this.content = content;
    }

    public boolean hasNext(){
        return next != null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
