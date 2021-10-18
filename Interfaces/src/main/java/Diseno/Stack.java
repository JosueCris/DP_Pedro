package Diseno;

public class Stack {
    int data;
    Stack next;

    public Stack(int data) {
        this.data = data;
        this.next = null;
    }

    public Stack push (int data){
        Stack start = this;
        Stack aux = start;
        start = new Stack(data);
        start.next = aux;

        return start;
    }

    public int top() {
        return data;
    }

    public Stack pop() {
        return this.next;
    }

    public void imprime() {
        System.out.println(data);
        if (next == null)
            return;
        next.imprime();
    }

}
