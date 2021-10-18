package Diseno;

public class Queue {
    private Node first;
    private Node last;
    
    public Queue()
    {
        first = null;
        last = null;
    }

    public boolean empty() {
        if (first == null || last == null)
            return true;
        return false;
    }

    public void insert(int data)
    {
        Node start = new Node(data);
        start.setNext(null);
        if(empty())
        {
            first = start;
            last = start;
        }
        last.setNext(start);
        last = last.getNext();
    }

    public int delete()
    {
        int aux = first.getData();
        first = first.getNext();
        return aux;
    }

    public int tell()
    {
        int count = 0;
        Node items = this.first;
        while(items != null)
        {
            count++;
            items = items.getNext();
        }
        return count;
    }

    public String toString()
    {
        Node item = this.first;
        String data = "";
        while(item != null)
        {
            data = data+item.toString();
            item = item.getNext();
        }
        return data;
    }
}
