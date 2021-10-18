package Diseno;

public class List {
    public int data;
    public List next;

    public List(int value) {
        this.data = value;
        this.next = null;
    }

    public List add(int value) {
        List current = this;
        List before = null;
        List nuevo;
        while (value > current.data && current.next != null) {
            before = current;
            current = current.next;
        }
        if (current.next == null) {
            if (value > current.data) {
                before = current;
                current = null;
            }
        }
        nuevo = new List(value);
        nuevo.next = current;
        if (before != null)
            before.next = nuevo;
        return nuevo;
    }

    public int search(int value) {
        if (this == null)
            return 0;
        if (value != this.data)
            next.search(value);
        return this.data;
    }

    public void delete(int value){
//       List aux, temp = this;
//        if(temp != null) {
//            if(value == temp.data) {
//                temp = temp.next;
//                aux = null;
//            }
//            next.delete(value);
//        }

        List current = this;
        List before = null;
        while(current.data != value && current.next != null) {
            before = current;
            current = current.next;
        }
        if(current.next == null && current.data != value)
            System.out.println("Item not found: "+value+"!!!");
        else {
            before.next = current.next;
            System.out.println(value+" was deleted");
        }
    }

    public void print() {
        System.out.print(data+" -> ");
        if (next == null)
            return;
        next.print();
    }
}

