package Diseno;

public class Node {
    //Declaracion de atributos
    private int data;
    private Node next;

    //Constructor
    public Node(int data){
        this.data = data;
    }

    //Metodos getter and setters
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //Metodo toString
    public String toString()
    {
        String node = data+" -> ";
        return node;
    }
}
